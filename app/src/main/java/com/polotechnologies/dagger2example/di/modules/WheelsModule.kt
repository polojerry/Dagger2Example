package com.polotechnologies.dagger2example.di.modules

import com.polotechnologies.dagger2example.dataClass.wheels.Rims
import com.polotechnologies.dagger2example.dataClass.wheels.Tyres
import com.polotechnologies.dagger2example.dataClass.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun ProvideRims(): Rims {
        return Rims()
    }

    @Provides
    fun ProvideTyres(): Tyres {
        val tyres = Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun ProvidesWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims, tyres)
    }

}