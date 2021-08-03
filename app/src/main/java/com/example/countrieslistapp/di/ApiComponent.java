package com.example.countrieslistapp.di;

import com.example.countrieslistapp.model.CountriesService;
import com.example.countrieslistapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {
    void inject(CountriesService service);
    void inject(ListViewModel viewModel);
}
