package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class DatePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        datePicker.init(
            Calendar.YEAR,
            Calendar.MONTH,
            Calendar.DAY_OF_MONTH
        ) { datePicker, year, month, dayofMonth ->
            display_date.text = this.formatDate(dayofMonth, month, year)
        }

    }

    fun pick(view: android.view.View) {
        display_date.text =
            this.formatDate(datePicker.dayOfMonth, datePicker.month, datePicker.year)

    }
}