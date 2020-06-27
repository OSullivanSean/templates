package com.example.springboot.model.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleModel {

    private String id;
    private String data;

    public ExampleModel(@JsonProperty("id") String id, @JsonProperty("data")String data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
