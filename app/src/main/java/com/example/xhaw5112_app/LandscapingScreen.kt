package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LandscapingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val landscapingView = findViewById<TextView>(R.id.view)


        landscapingView.text = "Landscaping\n"+
                "Fees: R1500\n" +
                "Purpose: To provide landscaping services for new and established gardens \n" +
                "Content:\n" +
                "Indigenous and exotic plants and trees\n" +
                "Fixed structures (fountains, statues, benches, tables, built-in braai)\n" +
                "Balancing of plants and trees in a garden\n" +
                "Aesthetics of plant shapes and colours\n" +
                "Garden layout\n"



        backButton.setOnClickListener{
            val intent = Intent(this@LandscapingScreen, CoursesScreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent =Intent(this@LandscapingScreen, ContactScreen::class.java)
            startActivity(intent)
        }



    }
}