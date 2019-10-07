package com.anupkumar.androiddatabinding

import android.content.Context
import android.widget.Toast

class EventHandler(var mContext: Context) {

    fun onButtonClick(name: String) {
        Toast.makeText(mContext, "Now you are following $name", Toast.LENGTH_SHORT).show()
    }
}