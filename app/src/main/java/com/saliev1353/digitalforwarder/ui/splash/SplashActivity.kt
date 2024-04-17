package com.saliev1353.digitalforwarder.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.ui.activity.MainActivity
import com.saliev1353.digitalforwarder.ui.ext.mainIntent
import com.saliev1353.digitalforwarder.ui.reg.RegisterActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_SCREEN_TIME : Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        enableEdgeToEdge()
        SystemBarStyle.dark(267894521)

        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Handler(Looper.myLooper()!!).postDelayed({
            mainIntent(RegisterActivity())
            finish()
        }, SPLASH_SCREEN_TIME)
    }


}