package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.car.Engine
import com.polotechnologies.dagger2example.dataClass.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindsPetrolEngine(petrolEngine: PetrolEngine) : Engine
}
