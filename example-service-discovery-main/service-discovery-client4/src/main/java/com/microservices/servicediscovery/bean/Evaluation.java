package com.microservices.servicediscovery.bean;

public class Evaluation {
    String id;
    String name;
    String point;
    
    public String getpoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
