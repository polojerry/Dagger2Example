package com.polotechnologies.dagger2example.dataClass.car

import android.util.Log
import com.polotechnologies.dagger2example.di.scopes.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class Car @Inject constructor(val driver: Driver, val wheels: Wheels, val engine: Engine) {

    fun drive(){
        engine.start()
        Log.d(TAG, "car: Vroooooooommm")
        driver.drive()

        Log.d(TAG, "drive: Driver $driver ${driver.driverName} Car : $this")

    }

    companion object {
        private const val TAG = "Car"
    }
}

