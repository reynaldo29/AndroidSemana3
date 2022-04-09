package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.view.*

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
    }
    fun androidCheckBoxClicked(view: View){
        when(view.id){
            R.id.checkBox -> this.showToast("${view.checkBox.text} Selected")
            R.id.checkBox2 ->this.showToast("${view.checkBox2.text} Selected")
            R.id.checkBox3 -> this.showToast("${view.checkBox3.text} Selected")
            R.id.checkBox4 ->this.showToast("${view.checkBox4.text} Selected")
            R.id.checkBox5 -> this.showToast("${view.checkBox5.text} Selected")
            R.id.checkBox6 ->this.showToast("${view.checkBox6.text} Selected")
            R.id.checkBox7 -> this.showToast("${view.checkBox7.text} Selected")
            R.id.checkBox8 ->this.showToast("${view.checkBox8.text} Selected")
            R.id.checkBox9 ->this.showToast("${view.checkBox9.text} Selected")
        }
    }
}