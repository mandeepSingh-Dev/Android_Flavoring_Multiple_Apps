package com.example.android_flavoring_multiple_apps

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.wake_lockapp.Constants

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texview = findViewById<TextView>(R.id.textview)

        if(Constants.type == Constants.TYPE.FREE)
        {
            texview.text = "free"

        }else{
            texview.text = "paid"
        }


    }
}