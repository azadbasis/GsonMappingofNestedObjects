package com.azhar.json.gson.gsonmappingofnestedobjects;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class UserSimple {

    private String name;
    private String email;
    private int age;
    private Boolean isDeveloper;

    public UserSimple(String name, String email, int age, Boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }
}
