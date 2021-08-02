package com.example.countrieslistapp.model;

public class CountriesService {
    public final String BASE_URL = "https://raw.githubusercontent.com/";

    private static CountriesService instance;

    private CountriesService(){
    }

    public static CountriesService getInstance(){
        if(instance==null){
            instance = new CountriesService();
        }
        return instance;
    }
}
