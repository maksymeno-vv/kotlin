package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    var listsUsers = listOf<User>(User("root", "root"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        var edit_login =findViewById<EditText>(R.id.editLogin)
        var edit_pass =findViewById<EditText>(R.id.editPassword)
        var login : String = edit_login.text.toString()
        var pass:String = edit_pass.text.toString()

       if (signIn(login,pass)!=null) {
           Toast.makeText(this, " Hello  $login", Toast.LENGTH_LONG).show()
           val scorePage1 = Intent(this, ScorePage1::class.java)
           startActivity(scorePage1)

       }else{
           Toast.makeText(this, " Error input login and password", Toast.LENGTH_LONG).show()
       }
    }



    private fun signIn(login: String, pass: String):User? {
      var result = listsUsers.firstOrNull{it.login== login && it.password== pass}
        return result


    }
}