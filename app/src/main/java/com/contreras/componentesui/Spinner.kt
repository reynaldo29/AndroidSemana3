package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        spinner()

    }

    fun spinner(){
    val languages = resources.getStringArray(R.array.lenguajes)

    val spinner = findViewById<Spinner>(R.id.spinner)
    if (spinner != null) {
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, languages)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                Toast.makeText(this@Spinner,
                    getString(R.string.selected_item) + " " +
                            "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
            override fun onNothingSelected(parent: AdapterView<*>) {

                }
            }
        }


    }

    fun showvalue(view: View) {
        val spinner = findViewById<Spinner>(R.id.spinner)
        val text= spinner.selectedItem.toString()
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }


}