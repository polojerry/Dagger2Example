package com.polotechnologies.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.polotechnologies.dagger2example.dataClass.car.Car
import com.polotechnologies.dagger2example.di.components.DaggerActivityComponents
import com.polotechnologies.dagger2example.util.Dagger2ExampleApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponents = DaggerActivityComponents.builder()
            .horsePowerBuilder(100)
            .engineCapacityBuilder(4000)
            .applicationComponent((application as Dagger2ExampleApplication).getApplicationComponent())
                .build()

        carComponents.inject(this)

        car.drive()

    }
}