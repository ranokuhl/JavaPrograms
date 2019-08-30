package com.ingka.warehouse.testing;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
