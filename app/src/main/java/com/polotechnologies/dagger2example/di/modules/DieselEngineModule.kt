package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.Engine
import com.polotechnologies.dagger2example.dataClass.engine.DieselEngine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun ProvideDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}