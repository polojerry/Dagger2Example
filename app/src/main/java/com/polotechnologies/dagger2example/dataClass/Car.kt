package com.polotechnologies.dagger2example.dataClass

import android.util.Log
import com.polotechnologies.dagger2example.dataClass.engine.DieselEngine
import com.polotechnologies.dagger2example.dataClass.engine.PetrolEngine
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun drive(){
        engine.start()
        Log.d(TAG, "drive: Vroooooooommm")
    }

    companion object {
        private const val TAG = "Car"
    }
}

