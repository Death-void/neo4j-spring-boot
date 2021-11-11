package com.nosqlproject.neo4jspringboot.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import java.io.Serializable;
import java.util.List;

@Data
@NodeEntity(label = "Route")
public class Route implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;
    private List<String> alongStation;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAlongStation() {
        return alongStation;
    }

    public void setAlongStation(List<String> alongStation) {
        this.alongStation = alongStation;
    }
}
