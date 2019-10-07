package com.anupkumar.androiddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.anupkumar.androiddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val user = User("Anup Shukla", "Mulund | India ", "240K", "324K")
        binding.user = user
        binding.handler = EventHandler(this)

    }


}

