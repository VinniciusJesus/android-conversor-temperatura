package com.eumarkus.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eumarkus.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener {
            if (!binding.editTxt.text.toString().isEmpty()) {

                val celsius = binding.editTxt.text.toString().toDouble()
                val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.result.text = "$fahrenheit F"
            } else {
                binding.result.text = "Temperatura inválida"
            }
        }
    }
}