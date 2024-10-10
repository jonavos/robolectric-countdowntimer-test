package com.example.robolectrictest

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.test)

        val text = findViewById<TextView>(R.id.textView)

        timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                text.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                text.text = "Liftoff!"
            }
        }.apply { start() }
    }
}
