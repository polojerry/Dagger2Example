package com.polotechnologies.dagger2example.dataClass.car

import android.util.Log
import com.polotechnologies.dagger2example.di.scopes.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class Driver {
    companion object {
        private const val TAG = "Car"
    }

    fun drive(){
        Log.d(TAG, "driver:Driving..... ")
    }

}