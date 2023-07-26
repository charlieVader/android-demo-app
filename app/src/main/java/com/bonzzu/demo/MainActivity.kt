package com.bonzzu.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bonzzu.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateCounterFragment()
        setEvents()
    }

    private fun setEvents() {
        binding.btnIncrease.setOnClickListener {
            counter++
            updateCounterFragment()
        }

        binding.btnDecrease.setOnClickListener {
            if (counter == 0) return@setOnClickListener

            counter--
            updateCounterFragment()
        }
    }

    private fun updateCounterFragment() {
        binding.tvCounter.text = counter.toString()
        binding.tvBodyCounter.text = counter.toString()
    }
}