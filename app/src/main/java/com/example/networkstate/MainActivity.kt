package com.example.networkstate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetworkLiveData.init(application)

        NetworkLiveData.observe(this, Observer {
            if (it) {
                Log.d("aaaaaaaaaaaaaa", "Connected")
            } else {
                Log.d("aaaaaaaaaaaaaa", "Connection Lost")
            }
        })

    }
}