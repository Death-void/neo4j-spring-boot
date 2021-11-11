package com.nosqlproject.neo4jspringboot.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import java.io.Serializable;
import java.util.List;

@Data
@NodeEntity(label="Timetable")
public class Timetable implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;
    private List<String> timetable;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTimetable() {
        return timetable;
    }

    public void setTimetable(List<String> timetable) {
        this.timetable = timetable;
    }
}
