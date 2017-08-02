package com.azhar.json.gson.gsonmappingofnestedobjects;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class Nanosoft {

    private String name;

    private NanosoftOwner owner;
    private NanosoftIt cook;
    private NanosoftIt waiter;

    private class NanosoftOwner {
        private String name;
        private UserAddress address;
    }


    private class NanosoftIt {

        private String name;
        private int age;
        private int salery;


    }
}
