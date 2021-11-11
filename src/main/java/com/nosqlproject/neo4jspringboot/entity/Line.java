package com.nosqlproject.neo4jspringboot.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import java.io.Serializable;

@Data
@NodeEntity(label = "Line")
public class Line implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private Boolean directional;
    private Integer interval;
    private Float kilometer;
    private String name;
    private String onewayTime;
    private String route;
    private String runtime;
    private String type;

    public Long getId() {
        return id;
    }

    public Boolean getDirectional() {
        return directional;
    }

    public void setDirectional(Boolean directional) {
        this.directional = directional;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public float getKilometer() {
        return kilometer;
    }

    public void setKilometer(float kilometer) {
        this.kilometer = kilometer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnewayTime() {
        return onewayTime;
    }

    public void setOnewayTime(String onewayTime) {
        this.onewayTime = onewayTime;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
