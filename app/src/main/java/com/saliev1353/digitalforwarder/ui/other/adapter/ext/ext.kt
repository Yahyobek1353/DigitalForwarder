package com.saliev1353.digitalforwarder.ui.other.adapter.ext

import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.saliev1353.digitalforwarder.ui.activity.MainActivity

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).centerCrop().into(this)
}

fun Context.mainIntent(class1: MainActivity){
    startActivity(Intent(this , class1::class.java))

}