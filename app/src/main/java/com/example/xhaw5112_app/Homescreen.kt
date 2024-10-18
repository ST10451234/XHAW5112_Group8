package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val contactButton = findViewById<Button>(R.id.contactButton)
        val coursesButton = findViewById<Button>(R.id.coursesButton)
        val feesButton = findViewById<Button>(R.id.feesButton)
        val homeDisplay = findViewById<TextView>(R.id.homeDisplay)



        homeDisplay.text = "Empowering the Nation was established in 2018 and offers courses in Johannesburg.\n" +
                "Hundreds of domestic workers and gardeners have been trained on both the six-month long\n" +
                "Learnerships and six-week Short Skills Training Programmes to empower themselves and \n" +
                "can provide more marketable skills. "

        contactButton.setOnClickListener{
            val intent = Intent(this,)
            startActivity(intent)
        }


        coursesButton.setOnClickListener {
            val intent = Intent(this, CoursesScreen::class.java)
            startActivity(intent)
        }


        feesButton.setOnClickListener{
            val intent =Intent(this, FeesScreen::class.java)
            startActivity(intent)
        }





    }
}