package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        bar()
    }
    fun bar(){
        var numbertext = findViewById<EditText>(R.id.numberText)
        var progressBar= findViewById<ProgressBar>(R.id.progressbar1)

        progressBar.setProgress(30)

    }
    fun show(view: View) {
       val valor  = numberText.getText().toString().toInt()
       progressbar1.setProgress(valor)
    }
}