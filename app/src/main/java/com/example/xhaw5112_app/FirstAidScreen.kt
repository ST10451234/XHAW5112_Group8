package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstAidScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val firstAidView = findViewById<TextView>(R.id.view)

        backButton.setOnClickListener{
            val intent = Intent(this@FirstAidScreen, CoursesScreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent = Intent(this@FirstAidScreen, ContactScreen::class.java)
            startActivity(intent)
        }

        firstAidView.text = "First Aid\n"+
                "Fees: R1500\n" +
                "Purpose: To provide first aid awareness and basic life support\n" +
                "Content:\n" +
                "• Wounds and bleeding\n" +
                "• Burns and fractures\n" +
                "• Emergency scene management\n" +
                "• Cardio-Pulmonary Resuscitation (CPR)\n" +
                "• Respiratory distress e.g., Choking, blocked airway"

    }
}