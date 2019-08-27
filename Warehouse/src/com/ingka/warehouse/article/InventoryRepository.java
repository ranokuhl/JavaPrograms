package com.ingka.warehouse.article;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryRepository {

    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        File jsonObject  = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");
        Map<String, Object> jsonMap = objectMapper.readValue(jsonObject,
                new TypeReference<Map<String,Object>>(){});

        System.out.println(jsonMap);

    }

}
