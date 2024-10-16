package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LifeSkillsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills_screen)


        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val lifeSkillsView = findViewById<TextView>(R.id.lifeSkillsView)

        lifeSkillsView.text = "Life Skills\n" +
            "Fees: R1500\n" +
                "Purpose: To provide skills to navigate basic life necessities\n" +
                "Content:\n" +
                " • Opening a bank account\n" +
                " • Basic labour law \n (know your rights)\n" +
                " • Basic reading and writing literacy \n" +
                " • Basic numeric literacy"


        backButton.setOnClickListener{
            val intent = Intent(this@LifeSkillsScreen, CoursesScreen::class.java)
            startActivity(intent)
        }
    }
}