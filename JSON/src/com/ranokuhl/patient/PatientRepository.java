package com.ranokuhl.patient;

import com.fasterxml.jackson.databind.*;
import java.io.*;

public class PatientRepository {


    public static void readPatient() {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Patient patient = mapper.readValue(new File("c:\\app-win\\writePatient.JSON"), Patient.class);

            System.out.println(patient.getFirstName() + " " + patient.getLastName());
            System.out.println(patient.toString());

        }catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static void writePatient() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {

            Patient patient = new Patient();

            patient.setFirstName("Jean-Marc");
            patient.setLastName("Julien");
            patient.setDateOfBirth("1991-02-03");
            patient.setAddress("555 Main Street");
            patient.setCity("Chicago");
            patient.setState("IL");
            patient.setZip("54321");
            patient.setPhone("555.123.9876");

            mapper.writeValue(new File("c:\\app-win\\writePatient.JSON"), patient);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
