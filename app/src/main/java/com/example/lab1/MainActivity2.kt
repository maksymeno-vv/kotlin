package com.example.lab1


import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       var view =  findViewById<RecyclerView>(R.id.recyclerView)
        var list = listOf<User>(User("user1","user1"),User("user2","user2"),User("user3","user3") )
        view.layoutManager = LinearLayoutManager(this)
        var adapter = UserAdapter(list,this)
        view.adapter = adapter
    }

}