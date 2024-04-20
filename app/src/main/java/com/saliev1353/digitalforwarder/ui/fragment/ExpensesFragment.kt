package com.saliev1353.digitalforwarder.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.digitalforwarder.data.model.price.PriceDto
import com.saliev1353.digitalforwarder.databinding.FragmentExpensesBinding
import com.saliev1353.digitalforwarder.ui.other.adapter.report.ReportAdapter

class ExpensesFragment : Fragment() {
    private val adapter : ReportAdapter by lazy {
        ReportAdapter()
    }
    private val binding : FragmentExpensesBinding by lazy {
        FragmentExpensesBinding.inflate(layoutInflater)
    }
    private val resultList = listOf(
        PriceDto("За Апрель : ", "30,000сом" , "14,000coм" , "16,000сом"),
        PriceDto("За Март : ", "34,000сом" , "15,000сом" , "18,000сом")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.rv.adapter = adapter
        adapter.submitList(resultList)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

}