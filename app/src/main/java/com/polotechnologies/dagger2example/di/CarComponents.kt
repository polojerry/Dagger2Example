package com.polotechnologies.dagger2example.di

import com.polotechnologies.dagger2example.MainActivity
import com.polotechnologies.dagger2example.dataClass.Car
import com.polotechnologies.dagger2example.di.modules.DieselEngineModule
import com.polotechnologies.dagger2example.di.modules.PetrolEngineModule
import com.polotechnologies.dagger2example.di.modules.WheelsModule
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponents {
    val car: Car

    fun inject(mainActivity : MainActivity)
}