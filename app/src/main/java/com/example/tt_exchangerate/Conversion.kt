package com.example.tt_exchangerate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conversion.*

class Conversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        button_Conversion.setBackgroundResource(R.drawable.conversion_in)
        button_Home.setBackgroundResource(R.drawable.home)
    }
}