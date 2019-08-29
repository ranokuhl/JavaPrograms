package com.ingka.warehouse.article;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class StaffRepository {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        File jsonFile = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/staff.json");

        StaffModel staff = mapper.readValue(jsonFile, StaffModel.class);

        System.out.println(staff);
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge());
        System.out.println("Position: " + staff.getPosition());
        System.out.println("Skills: " + staff.getSkills());
        System.out.println("Salary: " + staff.getSalary().values());

        System.out.println("============== pretty stings below =============");

        String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);

        System.out.println(prettyStaff1);


    }
}
