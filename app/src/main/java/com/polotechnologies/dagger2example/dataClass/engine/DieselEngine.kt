package com.polotechnologies.dagger2example.dataClass.engine

import android.util.Log
import com.polotechnologies.dagger2example.dataClass.Engine
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d(TAG, "start: Diesel Engine Starting..........")
    }

    companion object {
        private const val TAG = "Car"
    }
}