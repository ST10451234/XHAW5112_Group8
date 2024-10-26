package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChildMindingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val childMindingView = findViewById<TextView>(R.id.view)

        backButton.setOnClickListener{
            val intent = Intent(this@ChildMindingScreen, CoursesScreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent = Intent(this@ChildMindingScreen, ContactScreen::class.java)
            startActivity(intent)
        }

        childMindingView.text = "Child Minding\n"+
                "Fees: R750\n" +
                "Purpose: To provide basic child and baby care \n" +
                "Content:\n" +
                "• birth to six-month old baby needs\n" +
                "• seven-month to one year old needs\n" +
                "• Toddler needs\n" +
                "• Educational toys\n"

    }
}