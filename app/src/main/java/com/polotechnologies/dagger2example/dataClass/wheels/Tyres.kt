package com.polotechnologies.dagger2example.dataClass.wheels

import android.util.Log

class Tyres() {

    fun inflate(){
        Log.d(TAG, "inflater: Inflating.....")
    }

    companion object {
        private const val TAG = "Car"
    }
}