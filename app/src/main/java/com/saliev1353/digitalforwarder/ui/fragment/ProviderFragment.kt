package com.saliev1353.digitalforwarder.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.digitalforwarder.data.model.provider.ProviderDto
import com.saliev1353.digitalforwarder.databinding.FragmentProviderBinding
import com.saliev1353.digitalforwarder.ui.other.adapter.ProviderAdapter

class ProviderFragment : Fragment() {
    private val adapter : ProviderAdapter by lazy {
        ProviderAdapter()
    }
    private val binding : FragmentProviderBinding by lazy {
        FragmentProviderBinding.inflate(layoutInflater)
    }
    private val providerList = listOf(
        ProviderDto("Яхёбек", "Салиев" , "+996 990 05 54 45"),
        ProviderDto("Урмат", "Асаналиев" , "+996 990 05 54 45"),
        ProviderDto("Абдулазиз", "Сабиров" , "+996 990 05 54 45"),
        ProviderDto("Улан", "Аширов" , "+996 990 05 54 45"),
        ProviderDto("Арсен", "Сеня" , "+996 990 05 54 45"),
        ProviderDto("Бекзад", "Базарбаев" , "+996 990 05 54 45"),
        ProviderDto("Эрлан", "Самиев" , "+996 990 05 54 45"),
        ProviderDto("Азиз", "Ахмедов" , "+996 990 05 54 45"),
        ProviderDto("Абдулло", "Сабиржанов" , "+996 990 05 54 45"),
        ProviderDto("Али", "Алимов" , "+996 990 05 54 45"),
        ProviderDto("Сайфулло", "Алимов" , "+996 990 05 54 45"),
        ProviderDto("Бексултан", "Султанов" , "+996 990 05 54 45"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.rvProvider.adapter = adapter
        adapter.submitList(providerList)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

}