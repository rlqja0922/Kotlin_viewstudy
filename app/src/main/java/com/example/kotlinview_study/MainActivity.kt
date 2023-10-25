package com.example.kotlinview_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }
    fun settingButton(){
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent =  Intent(this,SubActivity::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            var intent2 =  Intent(this,colorActivity::class.java)
            startActivity(intent2)
        }
    }
}