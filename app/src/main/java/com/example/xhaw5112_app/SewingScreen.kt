package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SewingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val sewingView = findViewById<TextView>(R.id.view)

        sewingView.text = "Sewing\n"+
            "Fees: R1500\n" +
        "Purpose: To provide alterations and new garment tailoring services\n" +
        "Content:\n"+
        "• Types of stitches\n"+
        "• Threading a sewing machine\n" +
        "• Sewing buttons, zips, hems and seams\n" +
        "• Alterations\n" +
        "• Designing and sewing new garment\n"

        backButton.setOnClickListener{
            val intent = Intent(this@SewingScreen, CoursesScreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent =Intent(this@SewingScreen, ContactScreen::class.java)
            startActivity(intent)
        }

    }
}