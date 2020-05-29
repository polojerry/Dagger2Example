package com.polotechnologies.dagger2example.di

import com.polotechnologies.dagger2example.MainActivity
import com.polotechnologies.dagger2example.dataClass.Car
import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponents {
    val car: Car

    fun inject(mainActivity : MainActivity)
}