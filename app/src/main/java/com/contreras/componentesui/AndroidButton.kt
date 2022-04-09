package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AndroidButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)
    }

    fun callSimpleButton(view: View) {
        Toast.makeText(this,"Simple Buttom",Toast.LENGTH_SHORT).show()
    }

    fun callLeftIconButton(view: View){
        Toast.makeText(this,"Buttom with icon left",Toast.LENGTH_SHORT).show()
    }
    fun callRightIconButton(view: View){
        Toast.makeText(this,"Buttom with icon rigth",Toast.LENGTH_SHORT).show()
    }
    fun callBackgroundImageButton(view: View){
        Toast.makeText(this,"Buttom with background image",Toast.LENGTH_SHORT).show()
    }
    fun callBorderButton(view: View){
        Toast.makeText(this,"Buttom with border",Toast.LENGTH_SHORT).show()
    }
    fun callBorderRadiusButton(view: View){
        Toast.makeText(this,"Buttom with border radius",Toast.LENGTH_SHORT).show()
    }
    fun callRoundButton(view: View){
        Toast.makeText(this,"Buttom round",Toast.LENGTH_SHORT).show()
    }
    fun callMaterialDesignButton(view: View){
        Toast.makeText(this,"Buttom Material Design",Toast.LENGTH_SHORT).show()
    }
}