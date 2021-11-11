package com.nosqlproject.neo4jspringboot.dao;

import com.nosqlproject.neo4jspringboot.entity.Line;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineRepository extends Neo4jRepository<Line,Long> {
}
