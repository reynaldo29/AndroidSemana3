package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_switch_button.*
import kotlinx.android.synthetic.main.activity_toggle_buttons.*

class ToggleButtons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_buttons)
        toogle()
    }
    fun toogle(){
        val tg1 = findViewById<ToggleButton>(R.id.toggleButton1)
        tg1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) text_view1.setText("ToggleButton is ON") else text_view1.setText("Switch1:ToggleButton is OFF")

        }
        val tg2 = findViewById<ToggleButton>(R.id.toggleButton2)
        tg2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) text_view2.setText("ToggleButton is ON") else text_view2.setText("Switch1:ToggleButton is OFF")

        }
    }
}