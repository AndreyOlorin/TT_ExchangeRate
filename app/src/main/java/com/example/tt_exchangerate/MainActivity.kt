package com.example.tt_exchangerate

import android.app.ProgressDialog
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.button_To_Conversion
import kotlinx.android.synthetic.main.activity_main.button_To_Home
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {


    lateinit var pDialog: ProgressDialog
    val list = ArrayList<DataCourse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://www.cbr-xml-daily.ru/daily_json.js"

        button_To_Home.setBackgroundResource(R.drawable.home_in)
        button_To_Conversion.setBackgroundResource(R.drawable.conversion)
        AsyncTaskHandler().execute(url)

        button_To_Conversion.setOnClickListener{
            val Intent = Intent(this, Conversion::class.java)
            startActivity(Intent)
        }



    }

    inner class AsyncTaskHandler : AsyncTask<String,String,String>(){




    }

}