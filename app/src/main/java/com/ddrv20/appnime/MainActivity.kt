package com.ddrv20.appnime

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var sumNum: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: ImageView = findViewById(R.id.menu)

        updateTime()

        button.setOnClickListener {
            sumNum += 1
            updateTime()
        }
    }

    private fun updateTime() {
        val date: TextView = findViewById(R.id.date)
        val text = getString(R.string.time, sumNum)
        date.display(sumNum %2 == 0)
        date.updateTime(text)
    }
}



