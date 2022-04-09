package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)
        switch()
    }

    fun switch(){
        val sw1 = findViewById<Switch>(R.id.switchButton)
        sw1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) textView.setText("Switch1:ON") else textView.setText("Switch1:OFF")

        }
        val sw2 = findViewById<Switch>(R.id.switchButton2)
        sw2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) textView2.setText("Switch2:ON") else textView2.setText("Switch2:OFF")

        }
    }

}