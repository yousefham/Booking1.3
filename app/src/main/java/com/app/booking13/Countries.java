package com.app.booking13;

/**
 * Created by best tech on 8/16/2017.
 */

public class Countries {

    private String countryName ;
    private String countryContent ;

    public Countries(String countryName, String countryContent) {
        this.countryName = countryName;
        this.countryContent = countryContent;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryContent() {
        return countryContent;
    }

    public void setCountryContent(String countryContent) {
        this.countryContent = countryContent;
    }
}
