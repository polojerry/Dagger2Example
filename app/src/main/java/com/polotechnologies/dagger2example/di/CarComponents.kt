package com.polotechnologies.dagger2example.di

import com.polotechnologies.dagger2example.dataClass.Car
import dagger.Component

@Component
interface CarComponents {
    val car: Car
}