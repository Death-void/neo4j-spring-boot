package com.nosqlproject.neo4jspringboot.dao;

import com.nosqlproject.neo4jspringboot.entity.Station;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StationRepository extends Neo4jRepository<Station,Long> {

}
