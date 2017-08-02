package com.azhar.json.gson.gsonmappingofnestedobjects;

import com.google.gson.Gson;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class Main {

    public static void main(String[] args) {

        System.out.print("here is azhar");

        //    serializedUsernested();
        deserializedUserNested();
    }

    private static void deserializedUserNested() {

        String nanosoftJson = "{\n" +
                "  \"name\": \"Nano Information Technology Ltd\",\n" +
                "  \"owner\": {\n" +
                "    \"name\": \"Azharul Islam\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"North Badda\",\n" +
                "      \"houseNumber\": \"84/A\",\n" +
                "      \"city\": \"dhaka\",\n" +
                "      \"country\": \"Bnagladesh\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"cook\": {\n" +
                "    \"name\": \"shuhel vie\",\n" +
                "    \"age\": 24,\n" +
                "    \"salery\": 6777\n" +
                "  },\n" +
                "  \"waiter\": {\n" +
                "    \"name\": \"Shuhel vie\",\n" +
                "    \"age\": 23,\n" +
                "    \"salery\": 9000\n" +
                "  }\n" +
                "}";


        Nanosoft nanosoft = new Gson().fromJson(nanosoftJson, Nanosoft.class);
    }

    private static void serializedUsernested() {

        UserAddress userAddress = new UserAddress("North badda", "84/A", "dhaka", "Bangladesh");
        UserNested userNested = new UserNested("Aharul Islam", "azadbasis@gmail.com", 34, true, userAddress);


        String json = new Gson().toJson(userNested);

    }

}
