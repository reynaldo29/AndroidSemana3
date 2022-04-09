package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }
    fun register(view: View){

        if(edtFirstName.text.isBlank() && edtLastName.text.isBlank()){
            tvDisplayName.text = "Ingresar texto"

        }else {
            tvDisplayName.text = "Your username is : ${edtFirstName.text} ${edtFirstName.text} "
        }
    }
}