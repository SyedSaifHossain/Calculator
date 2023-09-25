package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var number_One : EditText
    lateinit var number_Two : EditText
    lateinit var addButton : Button
    lateinit var subButton : Button
    lateinit var multiButton : Button
    lateinit var dividedButton : Button
    lateinit var modulasButton: Button
    lateinit var answer : TextView

    var numOne : Int? = null
    var numTwo : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        number_One = findViewById(R.id.numberOne)
        number_Two = findViewById(R.id.numberTwo)
        addButton = findViewById(R.id.addtion)
        subButton = findViewById(R.id.subtraction)
        multiButton = findViewById(R.id.multiply)
        dividedButton = findViewById(R.id.divided)
        modulasButton = findViewById(R.id.modulas)
        answer = findViewById(R.id.answerTv)

        addButton.setOnClickListener(){
            if(number_One.text.isNullOrBlank() || number_Two.text.isNullOrBlank())
            {
                answer.text = ("Please give a proper value")
            }
            else{
                numOne = number_One.text.toString().toInt()
                numTwo = number_Two.text.toString().toInt()
                answer.text = (numOne!! + numTwo!!).toString()
            }
        }
        subButton.setOnClickListener(){
            if(number_One.text.isNullOrBlank() || number_Two.text.isNullOrBlank())
            {
                answer.text = ("Please give a proper value")
            }
            else{
                numOne = number_One.text.toString().toInt()
                numTwo = number_Two.text.toString().toInt()
                answer.text = (numOne!! - numTwo!!).toString()
            }
        }
        multiButton.setOnClickListener(){
            if(number_One.text.isNullOrBlank() || number_Two.text.isNullOrBlank())
            {
                answer.text = ("Please give a proper value")
            }
            else{
                numOne = number_One.text.toString().toInt()
                numTwo = number_Two.text.toString().toInt()
                answer.text = (numOne!! * numTwo!!).toString()
            }
        }
        dividedButton.setOnClickListener(){
            if(number_One.text.isNullOrBlank() || number_Two.text.isNullOrBlank())
            {
                answer.text = ("Please give a proper value")
            }
            else{
                numOne = number_One.text.toString().toInt()
                numTwo = number_Two.text.toString().toInt()
                answer.text = (numOne!! / numTwo!!).toString()
            }
        }
        modulasButton.setOnClickListener(){
            if(number_One.text.isNullOrBlank() || number_Two.text.isNullOrBlank())
            {
                answer.text = ("Please give a proper value")
            }
            else{
                numOne = number_One.text.toString().toInt()
                numTwo = number_Two.text.toString().toInt()
                answer.text = (numOne!! % numTwo!!).toString()
            }
        }
    }
}