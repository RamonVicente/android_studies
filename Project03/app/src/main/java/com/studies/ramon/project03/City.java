package com.studies.ramon.project03;

/**
 * Created by Ramon on 2018-05-13.
 */

public class City {

    private String name;
    private String info;

    public City(String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
