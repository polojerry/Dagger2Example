package com.polotechnologies.dagger2example.dataClass.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Driver @Inject constructor() {
    companion object {
        private const val TAG = "Car"
    }

    fun drive(){
        Log.d(TAG, "driver:Driving..... ")
    }

}