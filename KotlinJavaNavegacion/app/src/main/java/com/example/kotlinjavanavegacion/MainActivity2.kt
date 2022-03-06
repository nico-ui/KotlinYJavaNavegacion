package com.example.kotlinjavanavegacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinjavanavegacion.R
import android.widget.Toast
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.kotlinjavanavegacion.MainActivity

class MainActivity2 : AppCompatActivity() {
    var btnBack: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnBack = findViewById(R.id.btnBack)
    }

    fun clickBack(view: View?) {
        val context = applicationContext
        val text: CharSequence = "click boton back"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(context, text, duration)
        toast.show()
        val downloadIntent = Intent(this, MainActivity::class.java)
        startActivity(downloadIntent)
    }
}