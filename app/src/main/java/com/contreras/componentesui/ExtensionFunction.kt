package com.contreras.componentesui

import android.content.Context
import android.widget.Toast

fun Context.showToast(message:CharSequence) = Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

fun Context.formatDate(dayofMonth:Int,month:Int,year:Int): String {
    val monthCorrect = month + 1
    return "Dia: $dayofMonth - Mes: $monthCorrect - Año: $year"
}