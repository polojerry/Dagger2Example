package com.polotechnologies.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.polotechnologies.dagger2example.dataClass.car.Car
import com.polotechnologies.dagger2example.di.DaggerCarComponents
import com.polotechnologies.dagger2example.di.modules.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponents = DaggerCarComponents.builder()
            .horsePowerBuilder(100)
            .engineCapacityBuilder(4000)
                .build()

        carComponents.inject(this)

        car.drive()
        

    }
}