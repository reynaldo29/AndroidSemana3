package com.contreras.componentesui

import android.app.ProgressDialog.show
import android.content.DialogInterface
import android.os.Bundle

import android.view.View

import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout


class Snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

    }
    fun showSnackbar(view: View){
        val mySnackbar = Snackbar.make(findViewById(R.id.coordinatorLayout),
            "Hello, I am Android Snackbar!", Snackbar.LENGTH_SHORT)
        mySnackbar.setAction("undo", View.OnClickListener { System.out.println("Snackbar Set Action - OnClick.")
        })
        mySnackbar.show()
    }


}