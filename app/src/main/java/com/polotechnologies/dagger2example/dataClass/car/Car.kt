package com.polotechnologies.dagger2example.dataClass.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val driver: Driver, val wheels: Wheels, val engine: Engine) {

    fun drive(){
        engine.start()
        driver.drive()
        Log.d(TAG, "car: Vroooooooommm")
    }

    companion object {
        private const val TAG = "Car"
    }
}

