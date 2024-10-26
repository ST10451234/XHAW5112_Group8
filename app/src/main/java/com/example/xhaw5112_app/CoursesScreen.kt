package com.example.xhaw5112_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class CoursesScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_screen)

        val SixWeekCourses: Spinner = findViewById(R.id.weekselector)
        val SixMonthCourses: Spinner = findViewById(R.id.monthselector)
        val backButton = findViewById<Button>(R.id.backButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        val Six_Week_Courses = "Six Week Courses"
        val Six_Month_Courses = "Six Month Courses"


        val WeekCourses = arrayOf( Six_Week_Courses, "Child Minding", "Cooking", "Garden Maintenance")

        val MonthCourses = arrayOf( Six_Month_Courses, "First Aid", "Sewing", "Landscaping", "Life Skills")

        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, WeekCourses)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, MonthCourses)

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        SixWeekCourses.adapter = adapter1
        SixMonthCourses.adapter = adapter2


        backButton.setOnClickListener{
            val intent = Intent(this@CoursesScreen, Homescreen::class.java)
            startActivity(intent)
        }

        contactButton.setOnClickListener{
            val intent =Intent(this@CoursesScreen, ContactScreen::class.java)
            startActivity(intent)
        }





        SixMonthCourses.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    0->{
                        Toast.makeText(this@CoursesScreen, "Please select a valid course.", Toast.LENGTH_SHORT).show()
                        SixMonthCourses.setSelection(0)
                    }
                    1->{
                        val intent = Intent(this@CoursesScreen, FirstAidScreen::class.java)
                        startActivity(intent)

                    }
                    2->{
                        val intent= Intent(this@CoursesScreen, SewingScreen::class.java)
                        startActivity(intent)

                    }
                    3->{
                        val intent= Intent(this@CoursesScreen, LandscapingScreen::class.java)
                        startActivity(intent)

                    }
                    4-> {
                        val intent = Intent(this@CoursesScreen, LifeSkillsScreen::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        SixWeekCourses.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    0->{
                        Toast.makeText(this@CoursesScreen, "Please select a valid course.", Toast.LENGTH_SHORT).show()
                        SixWeekCourses.setSelection(0)
                    }
                    1->{
                        val intent = Intent(this@CoursesScreen, ChildMindingScreen::class.java)
                        startActivity(intent)

                    }
                    2->{
                        val intent = Intent(this@CoursesScreen, CookingScreen::class.java)
                        startActivity(intent)
                    }
                    3->{
                        val intent = Intent(this@CoursesScreen, GardenMaintenanceScreen::class.java)
                        startActivity(intent)

                    }
                    
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }




    }
    override fun onResume() {
        super.onResume()
        val SixWeekCourses:Spinner=findViewById(R.id.weekselector)
        val SixMonthCourses: Spinner = findViewById(R.id.monthselector)
        SixWeekCourses.setSelection(0)
        SixMonthCourses.setSelection(0)
    }
}

