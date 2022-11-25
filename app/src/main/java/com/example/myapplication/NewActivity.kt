package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val fruitsData = intent
        val fruitsName = fruitsData.getStringExtra("fruitsName")
        val fruitsInfo = fruitsData.getStringExtra("fruitsInfo")
        val fruitsStar = fruitsData.getStringExtra("fruitsStar")
        val fruitsImg = fruitsData.getIntExtra("fruitsImg",0)
        val imgF = findViewById<ImageView>(R.id.imgF)
        val fuitsName = findViewById<TextView>(R.id.fuitsName)
        val fuitsInfo = findViewById<TextView>(R.id.fuitsInfo)
        val fuitsStar = findViewById<TextView>(R.id.fuitsStar)
        imgF.setImageResource(fruitsImg)
        fuitsName.text = fruitsName
        fuitsInfo.text = fruitsInfo
        fuitsStar.text = fruitsStar


    }
}