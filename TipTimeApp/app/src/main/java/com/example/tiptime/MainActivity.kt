package com.example.tiptime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    //initializes the variable before using it
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // initializes the binding object which you'll use to access Views in layout
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Instead of passing the resource ID of the layout,
        // R.layout.activity_main,
        // this specifies the root of the hierarchy of views in your app, binding.root.
        setContentView(binding.root)

        binding.btncalculate.setOnClickListener {
            calculateTip()
        }


    }

    fun calculateTip(){
        val stringInTextField = binding.plainTextInput.text.toString()
        val cost = stringInTextField.toDouble()
        val optionSelected = binding.tipOptions.checkedRadioButtonId
        val tipPercent = when (optionSelected){
            R.id.twenty_percent -> 0.20
            R.id.eighteen_percent -> 0.18
            else -> 0.15
        }

        var tip = cost * tipPercent
        val roundup = binding.roundUpSwitch.isChecked

        if (roundup){
            tip = kotlin.math.ceil(tip)
        }

        val formatTip = NumberFormat.getCurrencyInstance().format(tip)

        binding.tipResult.text = getString(R.string.tip_amount, formatTip)


    }
}