package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rating_bar.*

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        bar()
    }

    fun bar(){
    val rBar = findViewById<RatingBar>(R.id.ratingBar)
    if (rBar != null) {
        val button = findViewById<Button>(R.id.ratingSubmitButton)
        button.setOnClickListener {
            val msg = rBar.rating.toString()
            ratingDisplay.setText(msg)
            Toast.makeText(this,
                "Rating is: $msg", Toast.LENGTH_SHORT).show()
            }
        }
    }
}