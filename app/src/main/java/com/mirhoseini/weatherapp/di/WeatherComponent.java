package com.mirhoseini.weatherapp.di;

import com.mirhoseini.weatherapp.ui.activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by Mohsen on 5/17/16.
 */
@Subcomponent(modules = WeatherModule.class)
public interface WeatherComponent {
    void inject(MainActivity activity);
}
