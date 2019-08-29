package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StaffModel {

    private String name;
    private int age;
    private List < String > position;
    private List < String > skills;
    private Map< String, Integer > salary;


    public StaffModel() {

    }

    public StaffModel(String name, int age, List <String> position, List <String> skills, Map <String, Integer> salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skills = skills;
        this.salary = salary;
    }

    public Map<String, Integer> getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(Map<String, Integer> salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(List<String> position) {
        this.position = position;
    }

    public String toString() {
        return getAge() + getName() + getPosition() + getSkills();
    }
}
