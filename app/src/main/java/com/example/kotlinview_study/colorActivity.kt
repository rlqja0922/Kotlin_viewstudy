package com.example.kotlinview_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class colorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        settingbuttons()
    }

    fun settingbuttons(){
        val button_red = findViewById<Button>(R.id.buttonred)
        val button_blue = findViewById<Button>(R.id.buttonblue)
        val button_yellow = findViewById<Button>(R.id.buttonyellow)
        button_red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout,RedFragment()).commit()
        }
        button_blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout,BlueFragment()).commit()
        }
        button_yellow.setOnClickListener {

            val fragmentTransaction = supportFragmentManager.beginTransaction()
//            fragmentTransaction.remove(RedFragment()).commit()
//            fragmentTransaction.remove(BlueFragment()).commit()
        }
    }
}