package com.example.hw_3_5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val result: TextView = findViewById(R.id.result)
        val receiveData = intent.getStringExtra("key")
        result.text = receiveData.toString()
    }
}