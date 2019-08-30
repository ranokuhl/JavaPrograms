package com.ingka.warehouse.testing;

import com.fasterxml.jackson.annotation.JsonMerge;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private String phone;
    @JsonMerge
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Employee of(String name, String dept, int salary, String phone, Address address) {
        Employee e = new Employee();
        e.name = name;
        e.dept = dept;
        e.salary = salary;
        e.phone = phone;
        e.address = address;
        return e;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
