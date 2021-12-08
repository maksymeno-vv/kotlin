package com.example.lab1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast
import android.widget.RadioButton
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.RadioGroup





class ScorePage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_page1)
        spinner = findViewById(R.id.spinner)
        textView = findViewById(R.id.textView)
        val radioGroup = findViewById<RadioGroup>(R.id.rdg_main_color)
        val cl: ConstraintLayout = findViewById(R.id.layout)



        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, users
        )
        spinner.adapter = adapter

        //textView

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {


            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                Toast.makeText(getApplicationContext()," $position" , Toast.LENGTH_SHORT).show()
                if(position ==0) {
                    var User1= User("User1","User1")
                      var user1 : String =  User1.Dnevnik.toString()
                    textView.setText(user1)
                }
                if(position == 1){
                    var User2= User("User2","User2")
                    var user2 : String =  User2.Dnevnik.toString()
                    textView.setText(user2)
                }
                if(position == 2){
                    var User3= User("User3","User3")
                    var user3 : String =  User3.Dnevnik.toString()
                    textView.setText(user3)
                }
            }


        }
         //radioButton

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                -1 -> cl.setBackgroundColor(Color.WHITE)
                R.id.rd_green -> cl.setBackgroundColor(Color.GREEN)
                R.id.rd_blue -> cl.setBackgroundColor(Color.BLUE)
                R.id.rd_red-> cl.setBackgroundColor(Color.RED)
            }
        }


    }




    fun back(view: View) {
        val main = Intent(this, MainActivity::class.java)
        startActivity(main)


    }

    var users = listOf<User>(User("user1", "user1"), User("user2", "user2"), User("user3", "user3"))


    lateinit var spinner: Spinner
    lateinit var textView: TextView
    lateinit var radioButton: RadioButton
}
