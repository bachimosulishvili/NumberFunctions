package com.example.numberfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Function3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function3)

        findViewById<Button>(R.id.buttonFunction3).setOnClickListener {
            val editText1Function3 = findViewById<EditText>(R.id.editText1Function3).text.toString().replace(" ", "")
            val editText2Function3 = findViewById<EditText>(R.id.editText2Function3).text.toString().replace(" ", "")

            val array1 = editText1Function3.split(",", ".")
            val array2 = editText2Function3.split(",", ".")

            val output = findViewById<TextView>(R.id.outputTextViewFunction3)
            val returnValue = function3(array1, array2)

            output.text = "ამ მწკრივების გაერთიანებაა \n${returnValue.contentToString()}"

        }
    }
}
private fun function3(array1: List<String>, array2: List<String>): Array<String> {
    var returnList = arrayOf<String>()
    for (i in array1)
        if (i !in returnList)
            returnList += i
    for (i in array2)
        if (i !in returnList)
            returnList +=i
    return returnList

}
