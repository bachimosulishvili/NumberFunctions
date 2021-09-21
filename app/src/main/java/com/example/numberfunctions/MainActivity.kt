package com.example.numberfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener{ startActivity(Intent(this, Function1Activity::class.java)) }
        findViewById<Button>(R.id.btn2).setOnClickListener{ startActivity(Intent(this, Function2Activity::class.java)) }
        findViewById<Button>(R.id.btn3).setOnClickListener{ startActivity(Intent(this, Function3Activity::class.java)) }
        findViewById<Button>(R.id.btn4).setOnClickListener{ startActivity(Intent(this, Function4Activity::class.java)) }
        findViewById<Button>(R.id.btn5).setOnClickListener{ startActivity(Intent(this, Function5Activity::class.java)) }


    }
}