package com.thevexillologist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            // Take name input before proceeding
            if (et_name.text.toString().isNullOrEmpty()) {
              Toast.makeText(this, "Please enter your name before proceeding", Toast.LENGTH_SHORT).show()
            }
            else {
                // Start InputParameters activity
            }

        }
    }
}