package com.example.dummyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activty)
        Singleton.deleteItem("Item1")
    }
}