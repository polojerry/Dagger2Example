package com.polotechnologies.dagger2example.di.components

import com.polotechnologies.dagger2example.dataClass.car.Driver
import com.polotechnologies.dagger2example.di.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [DriverModule::class])
@Singleton
interface ApplicationComponent {
    val driver: Driver
}