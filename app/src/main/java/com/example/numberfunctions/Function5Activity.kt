package com.example.numberfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Function5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function5)
        findViewById<Button>(R.id.buttonFunction5).setOnClickListener{
            val editTextFunction5 = findViewById<EditText>(R.id.editTextFunction5).text.toString().replace(" ", "")
            val array1 = editTextFunction5.split(",", ".")
            val output = findViewById<TextView>(R.id.outputTextViewFunction5)
            val resultList = function5(array1)
            output.text = "მეორე მაქს.: ${resultList[0]}\n" +
                    "მეორე მინ .: ${resultList[1]}"
        }
    }
}
private fun function5(array1: List<String>): List<Int> {
    var returnList = arrayOf<Int>()
    var almost_min:Int
    var almost_max:Int
    for (i in array1)
        if (i.toInt() !in returnList)
            returnList += i.toInt()
    almost_min = returnList.sorted()[1]
    almost_max = returnList.sortedDescending()[1]
    return listOf(almost_min, almost_max)
}