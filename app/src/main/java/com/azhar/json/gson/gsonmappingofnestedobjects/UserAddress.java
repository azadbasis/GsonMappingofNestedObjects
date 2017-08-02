package com.azhar.json.gson.gsonmappingofnestedobjects;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

class UserAddress {

    private String street;
    private String houseNumber;
    private String city;
    private String country;


    public UserAddress(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }


}
