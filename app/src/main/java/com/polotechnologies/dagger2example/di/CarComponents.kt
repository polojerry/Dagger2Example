package com.polotechnologies.dagger2example.di

import com.polotechnologies.dagger2example.MainActivity
import com.polotechnologies.dagger2example.dataClass.car.Car
import com.polotechnologies.dagger2example.di.modules.DieselEngineModule
import com.polotechnologies.dagger2example.di.modules.PetrolEngineModule
import com.polotechnologies.dagger2example.di.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponents {
    val car: Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePowerBuilder(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacityBuilder(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponents

    }
}