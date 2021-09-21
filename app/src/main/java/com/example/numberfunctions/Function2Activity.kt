package com.example.numberfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Function2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function2)

        findViewById<Button>(R.id.buttonFunction2).setOnClickListener{
            val editText1Function2 = findViewById<EditText>(R.id.editText1Function2).text.toString().replace(" ", "")
            val editText2Function2 = findViewById<EditText>(R.id.editText2Function2).text.toString().replace(" ", "")

            val array1 = editText1Function2.split(",", ".")
            val array2 = editText2Function2.split(",", ".")

            val output = findViewById<TextView>(R.id.outputTextViewFunction2)
            val returnValue = function2(array1, array2)
            output.text = "ამ მწკრივების თანაკვეთაა \n${returnValue.contentToString()}"
        }

    }
}
private fun function2(array1: List<String>, array2: List<String>):Array<String>{
    var returnList = arrayOf<String>()
    for (i in array1){
        if (i in array2 && i !in returnList){
            returnList+=i
        }

        }
    return returnList
}