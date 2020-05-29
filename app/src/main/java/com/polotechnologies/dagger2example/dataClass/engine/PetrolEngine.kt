package com.polotechnologies.dagger2example.dataClass.engine

import android.util.Log
import com.polotechnologies.dagger2example.dataClass.car.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(
            TAG, "start: Petrol Engine Starting... " +
                    "$horsePower->>Horse-Power " +
                    "$engineCapacity->>Engine Capacity"
        )
    }

    companion object {
        private const val TAG = "Car"
    }
}