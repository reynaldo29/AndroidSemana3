package com.contreras.componentesui

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class SimpleDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_dialog)
    }
    fun showDialog(view:View){
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Message").setPositiveButton("Positive Buttom",
                DialogInterface.OnClickListener{dialog,id ->
                    this.showToast("Click Positive Buttom")
        })
            .setNegativeButton("Negative Buttom",
                DialogInterface.OnClickListener{dialog,id ->
                    this.showToast("Click Negative Buttom")
                })

        builder.create()
        builder.show()

    }
}