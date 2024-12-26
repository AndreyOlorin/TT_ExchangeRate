package com.example.tt_exchangerate

import android.app.ProgressDialog
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button_To_Conversion
import kotlinx.android.synthetic.main.activity_main.button_To_Home


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://www.cbr-xml-daily.ru/daily_json.js"

        button_To_Home.setBackgroundResource(R.drawable.home_in)
        button_To_Conversion.setBackgroundResource(R.drawable.conversion)



    }

}