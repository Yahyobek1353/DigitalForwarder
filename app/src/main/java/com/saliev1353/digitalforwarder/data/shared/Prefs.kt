package com.saliev1353.digitalforwarder.data.shared

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class Prefs(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("prefs", MODE_PRIVATE)
    fun isShow() : Boolean {
        return prefs.getBoolean("onBoard", false)
    }

    fun changeShow(show: Boolean) {
        prefs.edit().putBoolean("onBoard", show).apply()
    }

}