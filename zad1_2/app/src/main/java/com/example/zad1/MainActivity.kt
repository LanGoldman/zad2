package com.example.zad1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import java.util.jar.Attributes.Name


class MainActivity : AppCompatActivity() {
    public final var APP_PREF = "settings"
    public var pref_file = "Account"
    public var pref_name = "Name"
    lateinit var setting: SharedPreferences
    private lateinit var namebox:EditText
    lateinit var nameview:TextView
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setting = getSharedPreferences(pref_file,MODE_PRIVATE)
    }
    fun save(view:View)
    {
        namebox = findViewById(R.id.namebox)
        var name = namebox.getText().toString()
        var prefEditor = setting.edit()
        prefEditor.putString(pref_name,name)
        prefEditor.apply()
        var intent = Intent(this,MainActivity2::class.java)
        intent.putExtra("Log",name)

        var log = findViewById<EditText>(R.id.passbox)
        var pas = findViewById<EditText>(R.id.namebox)
        if (log.text.toString() !="")
        {
            startActivity(intent)
        }
    }
}