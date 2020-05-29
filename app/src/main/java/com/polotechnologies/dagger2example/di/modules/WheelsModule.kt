package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.wheels.Rims
import com.polotechnologies.dagger2example.dataClass.wheels.Tyres
import com.polotechnologies.dagger2example.dataClass.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        val tyres = Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun providesWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims, tyres)
    }

}