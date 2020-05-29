package com.polotechnologies.dagger2example.dataClass.engine

import android.util.Log
import com.polotechnologies.dagger2example.dataClass.car.Engine
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(TAG, "start: Diesel Engine Starting... $horsePower Horse-Power")
    }

    companion object {
        private const val TAG = "Car"
    }
}