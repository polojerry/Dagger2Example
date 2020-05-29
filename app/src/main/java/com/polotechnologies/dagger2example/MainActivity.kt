package com.polotechnologies.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.polotechnologies.dagger2example.dataClass.Car
import com.polotechnologies.dagger2example.di.CarComponents
import com.polotechnologies.dagger2example.di.DaggerCarComponents

class MainActivity : AppCompatActivity() {
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car = DaggerCarComponents.create().car
        car.drive()
        

    }
}