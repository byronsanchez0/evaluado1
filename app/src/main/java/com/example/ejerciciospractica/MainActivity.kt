package com.example.ejerciciospractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.ejerciciospractica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var binding: ActivityMainBinding

    private val opciones = arrayListOf("uwu", "owo", "pto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val spinnerAdapter = ArrayAdapter(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            opciones,
        )

        binding.espiner.apply {
            adapter = spinnerAdapter
            setSelection(0, true)
            onItemSelectedListener = this@MainActivity
        }







    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}