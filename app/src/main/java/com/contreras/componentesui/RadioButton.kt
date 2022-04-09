package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio_button.*


class RadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        answer()
    }
    fun answer(){
    btnButton.setOnClickListener{

        var id: Int = radioGroup.checkedRadioButtonId
        if (id!=-1){
            // Get the instance of radio button using id
            val radio:RadioButton = findViewById(id)
            Toast.makeText(applicationContext,"On button click :" + " ${radio.text}", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext,"On button click :" + " nothing selected", Toast.LENGTH_SHORT).show()
        }
    }

}
fun radioButtonClicked(view: android.view.View){
    val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
    Toast.makeText(applicationContext,"On click : ${radio.text}", Toast.LENGTH_SHORT).show()
}

}