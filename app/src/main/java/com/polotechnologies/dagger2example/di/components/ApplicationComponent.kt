package com.polotechnologies.dagger2example.di.components

import com.polotechnologies.dagger2example.di.modules.DieselEngineModule
import com.polotechnologies.dagger2example.di.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [DriverModule::class])
@Singleton
interface ApplicationComponent {

    fun getActivityComponents(dieselEngineModule: DieselEngineModule) : ActivityComponents
}