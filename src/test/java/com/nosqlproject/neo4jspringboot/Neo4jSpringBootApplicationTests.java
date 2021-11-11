package com.nosqlproject.neo4jspringboot;

import com.nosqlproject.neo4jspringboot.dao.LineRepository;
import com.nosqlproject.neo4jspringboot.dao.RouteRepository;
import com.nosqlproject.neo4jspringboot.dao.StationRepository;
import com.nosqlproject.neo4jspringboot.dao.TimetableRepository;
import com.nosqlproject.neo4jspringboot.entity.Line;
import com.nosqlproject.neo4jspringboot.entity.Route;
import com.nosqlproject.neo4jspringboot.entity.Station;
import com.nosqlproject.neo4jspringboot.entity.Timetable;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Neo4jSpringBootApplicationTests {

    @Autowired
    StationRepository stationRepository;
    @Autowired
    RouteRepository routeRepository;
    @Autowired
    LineRepository lineRepository;
    @Autowired
    TimetableRepository timetableRepository;

    @Test
    public void testFind1(){
        Optional<Station> station = stationRepository.findById(677L);
        System.out.println(station.get());

    }

    @Test
    public void testFind2(){
        Optional<Route> r = routeRepository.findById(1516L);
        System.out.println(r.get());
    }

    @Test
    public void testFind3(){
        Optional<Line> l = lineRepository.findById(1691L);
        System.out.println(l.get().getId());
    }

    @Test
    public void testFind4(){
        Optional<Timetable> t = timetableRepository.findById(1784L);
        System.out.println(t.get().getTimetable().get(0).split(",")[0]);
    }
    @Test
    public  void testCreateStationLines(){
        Iterable<Route> r = routeRepository.findAll();

        List<Route> routeNodes = Lists.newArrayList(r);
        for (int i = 0; i < routeNodes.size(); i++) {
            for (int j = 0; j < routeNodes.get(i).getAlongStation().size(); j++) {
                Station s = new Station();
                s.setId(routeNodes.get(i).getAlongStation().get(j));
                Example<Station> stationExample = Example.of(s);
                List<Station> stationAdd = stationRepository.findAll(stationExample);
                stationAdd.get(0).addLines(routeNodes.get(i).getName());
                stationRepository.saveAll(stationAdd);
            }
        }


    }

}
