package com.nosqlproject.neo4jspringboot.entity;

import lombok.Data;

import lombok.With;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.DynamicLabels;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Data
@NodeEntity(label = "Station")
public class Station implements Serializable {
    @Id
    @GeneratedValue
    private Long id_generated;

    @Property
    private String name;
    private String id;
    private String english;

    @DynamicLabels
    private Set<String> lines;


    public Long getId_generated() {
        return id_generated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Set<String> getLines() {
        return lines;
    }

    public void setLines(Set<String> lines) {
        this.lines = lines;
    }

    public void addLines(String newline) {
        this.lines.add(newline);
    }
}
