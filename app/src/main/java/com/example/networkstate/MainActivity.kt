package com.example.networkstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var networkListener: NetworkListener
    private lateinit var network: Network

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBtn.setOnClickListener {
            network = Network()
            //network.checkNetworkAvailability(this)
            Toast.makeText(this@MainActivity, network.checkNetworkAvailability(this).toString(), Toast.LENGTH_SHORT).show()
        }
        

//        lifecycleScope.launch {
//            networkListener = NetworkListener()
//            networkListener.checkNetworkAvailability(this@MainActivity)
//                .collect { status ->
//                    Toast.makeText(this@MainActivity, status.toString(), Toast.LENGTH_SHORT).show()
//                }
//        }
    }
}