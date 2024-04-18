package com.saliev1353.digitalforwarder.ui.onBoard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.digitalforwarder.databinding.FragmentOnBoardBinding
import com.saliev1353.digitalforwarder.ui.activity.reg.RegisterActivity
import com.saliev1353.digitalforwarder.ui.other.adapter.onBoard.OnBoardAdapter

class OnBoardFragment : Fragment() {
    private val binding: FragmentOnBoardBinding by lazy {
        FragmentOnBoardBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = OnBoardAdapter()
        binding.viewPager.adapter = adapter

    }
}