package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {
    @Provides
    @Singleton
    fun provideDriver(): Driver = Driver()
}