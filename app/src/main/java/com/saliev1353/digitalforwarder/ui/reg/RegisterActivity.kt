package com.saliev1353.digitalforwarder.ui.reg

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.databinding.ActivityMainBinding
import com.saliev1353.digitalforwarder.databinding.ActivityRegisterBinding
import com.saliev1353.digitalforwarder.ui.activity.MainActivity
import com.saliev1353.digitalforwarder.ui.ext.mainIntent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {
    private val binding :  ActivityRegisterBinding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnNext.setOnClickListener {
            mainIntent(MainActivity())
            finish()
        }
    }
}