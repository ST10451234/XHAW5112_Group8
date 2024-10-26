package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ContactScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_screen)

        val backButton = findViewById<Button>(R.id.backButton)
        val info = findViewById<TextView>(R.id.contactinfo)

        info.text = "Contact Us\n" +
                "Jared Watson"+ "0662472841" +"ST10451234@imconnect.edu.za\n"+
                "Destiny Qwabe" + "0655377690" + "ST10457161@imconnect.edu.za\n" +
                "Karabo Phungula"+ "0659905623" +  "ST10455996@imconnect.edu.za"

        backButton.setOnClickListener{
            val intent = Intent(this@ContactScreen, Homescreen::class.java)
            startActivity(intent)
        }


    }
}