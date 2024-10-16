package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class FeesScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees_screen)


        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val nameEdit = findViewById<EditText>(R.id.nameEditText)
        val numberEdit = findViewById<EditText>(R.id.numberEditText)
        val emailEdit = findViewById<EditText>(R.id.emailEditText)

        val totalView = findViewById<TextView>(R.id.totalView)
        val totalButton = findViewById<Button>(R.id.totalButton)

        val childmindingBox = findViewById<CheckBox>(R.id.childMindingBox)
        val cookingBox = findViewById<CheckBox>(R.id.cookingBox)
        val gardenMaintenanceBox = findViewById<CheckBox>(R.id.gardenMaintenanceBox)
        val firstAidBox = findViewById<CheckBox>(R.id.firstAidBox)
        val sewingBox = findViewById<CheckBox>(R.id.sewingBox)
        val landscapingBox = findViewById<CheckBox>(R.id.landscapingBox)
        val lifeSkillsBox = findViewById<CheckBox>(R.id.lifeSkillsBox)

        val childMinding:Int = 750
        val cooking: Int = 750
        val gardenMaintenance: Int = 750
        val firstAid:Int = 1500
        val sewing:Int = 1500
        val landscaping:Int = 1500
        val lifeSkills:Int = 1500
        var total: Int= 0





        childmindingBox.setOnClickListener{
            total += childMinding

        }

        cookingBox.setOnClickListener{
            total += cooking
        }

        gardenMaintenanceBox.setOnClickListener{
            total+=gardenMaintenance
        }

        firstAidBox.setOnClickListener{
            total+=firstAid
        }

        sewingBox.setOnClickListener{
            total+=sewing
        }

        landscapingBox.setOnClickListener{
            total+=landscaping
        }

        lifeSkillsBox.setOnClickListener{
            total+=lifeSkills
        }

        backButton.setOnClickListener{
            val intent = Intent(this@FeesScreen, MainActivity::class.java)
            startActivity(intent)
        }

        totalButton.setOnClickListener {
            totalView.text = "R$total"
        }
    }
}