package com.example.dummyapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var listUpdated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivty::class.java))
        }
        Singleton.myInterface = object : TestInterface {
            override fun notifyDelete(deletedItem: String) {
                Log.i("DebugTag", "MainActivity Deleted Item : ${deletedItem}")
            }
        }
    }
}
