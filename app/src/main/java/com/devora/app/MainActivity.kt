package com.devora.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.titleText)
        val subtitle = findViewById<TextView>(R.id.subtitleText)
        val button = findViewById<Button>(R.id.startButton)

        title.text = "DEVORA"
        subtitle.text = "Connect • Community • Support"

        button.setOnClickListener {
            subtitle.text = "Welcome to DEVORA"
        }
    }
}
