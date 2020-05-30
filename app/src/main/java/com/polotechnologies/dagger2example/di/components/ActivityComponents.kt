package com.polotechnologies.dagger2example.di.components

import com.polotechnologies.dagger2example.MainActivity
import com.polotechnologies.dagger2example.dataClass.car.Car
import com.polotechnologies.dagger2example.di.modules.DieselEngineModule
import com.polotechnologies.dagger2example.di.modules.PetrolEngineModule
import com.polotechnologies.dagger2example.di.modules.WheelsModule
import com.polotechnologies.dagger2example.di.scopes.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@ApplicationScope
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponents {
    val car: Car

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{

        fun create(@BindsInstance @Named("horsePower") horsePower: Int,
            @BindsInstance @Named("engineCapacity") engineCapacity: Int) : ActivityComponents
    }
}