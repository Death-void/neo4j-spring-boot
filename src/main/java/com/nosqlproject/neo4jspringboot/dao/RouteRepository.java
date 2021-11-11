package com.nosqlproject.neo4jspringboot.dao;

import com.nosqlproject.neo4jspringboot.entity.Route;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends Neo4jRepository<Route,Long> {

}
