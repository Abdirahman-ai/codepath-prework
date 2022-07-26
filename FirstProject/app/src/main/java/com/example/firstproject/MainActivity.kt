package com.example.firstproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This kotlin file is where we are going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show this layout file:activity_main
        setContentView(R.layout.activity_main)

        // Display Customized to show "Hello form {name}"
        // 1. add a button to out layout

        // get a reference to a button
        findViewById<Button>(R.id.button).setOnClickListener{
            //handle button  tap
            // 2. change the color of the text
            Log.i("Abdinahmen" ,"Tapped on button")

            // 1. To change color get a reference to text view
            // 2. set the color of the text view

            findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#0000FF"))
            }
        // 2. set up logic to know when user has tapped on button
          // 2. change the color of the text


    }
}


