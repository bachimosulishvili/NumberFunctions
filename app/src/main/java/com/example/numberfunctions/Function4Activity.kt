package com.example.numberfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Function4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function4)

        findViewById<Button>(R.id.buttonFunction4).setOnClickListener{
            val editTextFunction4 = findViewById<EditText>(R.id.editTextFunction4).text.toString().replace(" ", "")
            val array1 = editTextFunction4.split(",", ".")
            val output = findViewById<TextView>(R.id.outputTextViewFunction4)
            val returnValue = function4(array1)
            output.text = "ამ რიცხვების არითმეტიკულ საშუალოზე ნაკლები რიცხვებია \n${returnValue.contentToString()}"
        }
    }
}

private fun function4(array1: List<String>): Array<String> {
    var returnList = arrayOf<String>()
    var avg = 0
    for (i in array1)
        avg += i.toInt()
    avg /= array1.size

    for (i in array1)
        if (i.toInt() < avg)
            returnList += i
    return returnList
}