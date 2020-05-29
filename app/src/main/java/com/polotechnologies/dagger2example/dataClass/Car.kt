package com.polotechnologies.dagger2example.dataClass

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun drive(){
        Log.d(Companion.TAG, "drive: Vroooooooommm")
    }

    companion object {
        private const val TAG = "Car"
    }
}

