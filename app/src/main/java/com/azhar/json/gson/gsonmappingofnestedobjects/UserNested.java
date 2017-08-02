package com.azhar.json.gson.gsonmappingofnestedobjects;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class UserNested {

    private String name;
    private String email;
    private int age;
    private Boolean isDeveloper;

    //new
    private UserAddress userAddress;
    public UserNested(String name, String email, int age, Boolean isDeveloper, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.userAddress = userAddress;
    }

}
