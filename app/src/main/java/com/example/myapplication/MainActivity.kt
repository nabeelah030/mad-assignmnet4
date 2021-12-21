package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : AppCompatActivity() {
    lateinit var requestQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestQueue = Volley.newRequestQueue(this)

        var sbtn = findViewById<Button>(R.id.strbtn)
        sbtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.apitxt)
// ...

// Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(this)
            val url = "https://www.google.com"

// Request a string response from the provided URL.
            val stringRequest = StringRequest(
                Request.Method.GET,
                url,
                {
                    textView.text = it
                },
                {
                })
            requestQueue.add(stringRequest)
        }
    }
}