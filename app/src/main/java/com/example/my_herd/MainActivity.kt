package com.example.my_herd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.WindowCompat
import com.example.my_herd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("TAG_TEST", "onCreate: Inside Logo")
        Intent(this,MainActivity::class.java).also { startActivity(it) }




//        setSupportActionBar(binding.toolbar)

        Intent(this, LoginActivity::class.java).also {startActivity(it)}
    }
}