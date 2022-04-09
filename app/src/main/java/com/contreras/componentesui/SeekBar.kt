package com.contreras.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        seekBar.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener {
            override fun onStopTrackingTouch(p0: SeekBar?) {
                showToast("Seekbar Touch Stop")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                showToast("Seekbar Touch Stop")
            }

            override fun onProgressChanged(p0: SeekBar?,progress:Int,fromUser:Boolean) {
                count.text="Progress: $progress / ${seekBar.max}"
                showToast("SeekBar Progress Change")
            }

        })
    }

}