package com.nosqlproject.neo4jspringboot.dao;

import com.nosqlproject.neo4jspringboot.entity.Timetable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends Neo4jRepository<Timetable,Long> {
}
