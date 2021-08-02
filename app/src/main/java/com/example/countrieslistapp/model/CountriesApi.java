package com.example.countrieslistapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountriesApi {
    @GET("DevTides/countries/master/countriesV2.json")
    Single<List<CountryModel>> getCountries();
    //single emits one value and finishes. In this case it emits the list of countries.
}
