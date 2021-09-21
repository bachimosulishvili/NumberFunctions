package com.example.numberfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Function1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function1)

        findViewById<Button>(R.id.buttonFunction1).setOnClickListener{
            val editTextFunction1 = findViewById<EditText>(R.id.editTextFunction1).text.toString().replace(" ", "")
            val array1 = editTextFunction1.split(",", ".")
            val output = findViewById<TextView>(R.id.outputTextViewFunction1)
            val returnValue = function1(array1)
            output.text = "მოცემულ მწკრივში არის ${returnValue} ინდივიდუალური რიცხვი."
        }
        }
    }

    private fun function1(array1: List<String>):Int{
        var returnList = arrayOf<String>()
        for (i in array1){
            if (i in returnList){continue}
            else{returnList+=i}
        }
        return returnList.size
    }
