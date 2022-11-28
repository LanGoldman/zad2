package com.example.zad111111

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    lateinit var tex : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tex1 = findViewById<TextView>(R.id.secondtext)
        var l = getIntent().getStringExtra("Log")
        tex1.text = l.toString()
    }
}