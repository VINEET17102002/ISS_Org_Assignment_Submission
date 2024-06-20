package com.example.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParsingExample {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30}";

        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(jsonString);
            String name = (String) json.get("name");
            long age = (Long) json.get("age");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
