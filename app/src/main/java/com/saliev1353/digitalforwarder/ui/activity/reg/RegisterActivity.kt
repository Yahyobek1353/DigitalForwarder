package com.saliev1353.digitalforwarder.ui.activity.reg

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.databinding.ActivityRegisterBinding
import com.saliev1353.digitalforwarder.ui.activity.MainActivity
import com.saliev1353.digitalforwarder.ui.other.adapter.ext.mainIntent
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
        onClick()
        onLastName()

    }

    private fun onLastName() {
        if (binding.editTextName.text?.length == 0){
            binding.editTextName.error = true.toString()
        }else if(binding.editTextName.text?.length!! > 0 ){
            binding.editTextName.error = false.toString()
        }
    }

    private fun onClick() {
        binding.btnNext.setOnClickListener {
            mainIntent(MainActivity())
            finish()
        }
    }
}