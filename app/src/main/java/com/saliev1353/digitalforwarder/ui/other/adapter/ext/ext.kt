package com.saliev1353.digitalforwarder.ui.other.adapter.ext

import android.content.Context
import android.content.Intent
import com.saliev1353.digitalforwarder.ui.activity.MainActivity

fun Context.mainIntent(class1: MainActivity){
    startActivity(Intent(this , class1::class.java))

}