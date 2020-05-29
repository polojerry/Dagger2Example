package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.Engine
import com.polotechnologies.dagger2example.dataClass.engine.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun BindsPetrolEngine(petrolEngine: PetrolEngine) : Engine
}
