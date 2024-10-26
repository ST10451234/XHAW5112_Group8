package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CookingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val cookingView = findViewById<TextView>(R.id.view)

        backButton.setOnClickListener{
            val intent = Intent(this@CookingScreen, CoursesScreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent = Intent(this@CookingScreen, ContactScreen::class.java)
            startActivity(intent)
        }

        cookingView.text = "Cooking\n" +
                "Fees: R750\n" +
                "Purpose: To prepare and cook nutritious family meals\n" +
                "Content:\n" +
                "• Nutritional requirements for a healthy body\n" +
                "• Types of protein, carbohydrates and vegetables\n" +
                "• Planning meals\n" +
                "• Preparation and cooking of meals"

    }
}