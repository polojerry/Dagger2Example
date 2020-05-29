package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.car.Engine
import com.polotechnologies.dagger2example.dataClass.engine.DieselEngine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }
}