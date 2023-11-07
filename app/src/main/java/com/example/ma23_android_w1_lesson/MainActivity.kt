package com.example.ma23_android_w1_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count : Int = 0
    lateinit var helloTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.helloView)

        helloTextView.text = "David"


    }
    fun changeText(){
        helloTextView.text = "Susan"
    }
}