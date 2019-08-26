package com.ranokuhl.Engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ranokuhl.patient.Patient;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateFormatEngine {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Patient patient = mapper.readValue(new File("c:\\app-win\\writePatient.JSON"), Patient.class);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
            Date date = dateFormat.parse(patient.getDateOfBirth());

            mapper.setDateFormat(dateFormat);
            System.out.println("patient birthdate: " + mapper.writeValueAsString(date));

        } catch (IOException e) {

            e.printStackTrace();

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }

}
