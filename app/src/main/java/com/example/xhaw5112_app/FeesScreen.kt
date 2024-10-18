package com.example.xhaw5112_app

import android.app.Person
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeesScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees_screen)


        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val consultButton = findViewById<Button>(R.id.consultButton)

        val nameEdit = findViewById<EditText>(R.id.nameEditText)
        val numberEdit = findViewById<EditText>(R.id.numberEditText)
        val emailEdit = findViewById<EditText>(R.id.emailEditText)

        val name = nameEdit.text.toString()
        val number = numberEdit.text.toString()
        val email = emailEdit.text.toString()

        val totalView = findViewById<TextView>(R.id.totalView)
        val totalButton = findViewById<Button>(R.id.totalButton)

        val childmindingBox = findViewById<CheckBox>(R.id.childMindingBox)
        val cookingBox = findViewById<CheckBox>(R.id.cookingBox)
        val gardenMaintenanceBox = findViewById<CheckBox>(R.id.gardenMaintenanceBox)
        val firstAidBox = findViewById<CheckBox>(R.id.firstAidBox)
        val sewingBox = findViewById<CheckBox>(R.id.sewingBox)
        val landscapingBox = findViewById<CheckBox>(R.id.landscapingBox)
        val lifeSkillsBox = findViewById<CheckBox>(R.id.lifeSkillsBox)

        val childMindingPrice:Int = 750
        val cookingPrice: Int = 750
        val gardenMaintenancePrice: Int = 750
        val firstAidPrice:Int = 1500
        val sewingPrice:Int = 1500
        val landscapingPrice:Int = 1500
        val lifeSkillsPrice:Int = 1500
        var total: Int= 0

        data class Customer(val name: String, val number: String, val email: String)

        val customerDetails = mutableListOf<Customer>()

        consultButton.setOnClickListener{
            if (name.isNotEmpty() && number.isNotEmpty() && email.isNotEmpty())
            {
                val newCustomer = Customer(name, number, email)
                customerDetails.add(newCustomer)
            }

        }





        val selectedCourses = mutableListOf<String>()

        fun updateCourseSelection(checkBox: CheckBox, courseName: String, price: Int) {
            if (checkBox.isChecked) {
                total += price
                selectedCourses.add(courseName) // Add course to selected list
            } else {
                total -= price
                selectedCourses.remove(courseName) // Remove course from selected list
            }


        }

        childmindingBox.setOnClickListener {
            updateCourseSelection(childmindingBox, "Child Minding", childMindingPrice)
        }

        cookingBox.setOnClickListener {
            updateCourseSelection(cookingBox, "Cooking", cookingPrice)
        }

        gardenMaintenanceBox.setOnClickListener {
            updateCourseSelection(gardenMaintenanceBox, "Garden Maintenance", gardenMaintenancePrice)
        }

        firstAidBox.setOnClickListener {
            updateCourseSelection(firstAidBox, "First Aid", firstAidPrice)
        }

        sewingBox.setOnClickListener {
            updateCourseSelection(sewingBox, "Sewing", sewingPrice)
        }

        landscapingBox.setOnClickListener {
            updateCourseSelection(landscapingBox, "Landscaping", landscapingPrice)
        }

        lifeSkillsBox.setOnClickListener {
            updateCourseSelection(lifeSkillsBox, "Life Skills", lifeSkillsPrice)
        }


        backButton.setOnClickListener{
            val intent = Intent(this@FeesScreen, Homescreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
        }


        totalButton.setOnClickListener {


            val discount: Double = when {
                selectedCourses.size > 3 -> 0.85
                selectedCourses.size == 3 -> 0.90
                selectedCourses.size == 2 -> 0.95
                else -> 1.0
            }

            total = (total * discount).toInt()

            totalView.text = total.toString()
        }

        clearButton.setOnClickListener{
            nameEdit.setText("Enter Name")
            numberEdit.setText("Enter Phone Number")
            emailEdit.setText("Enter Email Address")
            childmindingBox.isChecked = false
            cookingBox.isChecked = false
            gardenMaintenanceBox.isChecked = false
            firstAidBox.isChecked = false
            sewingBox.isChecked = false
            landscapingBox.isChecked = false
            lifeSkillsBox.isChecked = false
            totalView.text = ""
        }
    }
}
