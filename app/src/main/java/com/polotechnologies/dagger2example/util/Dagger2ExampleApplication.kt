package com.polotechnologies.dagger2example.util

import android.app.Application
import com.polotechnologies.dagger2example.di.components.ApplicationComponent
import com.polotechnologies.dagger2example.di.components.DaggerApplicationComponent
import com.polotechnologies.dagger2example.di.modules.DriverModule

class Dagger2ExampleApplication  :Application() {
    private lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(
            DriverModule("Polo"))
    }

    fun getApplicationComponent() : ApplicationComponent{
        return applicationComponent
    }
}