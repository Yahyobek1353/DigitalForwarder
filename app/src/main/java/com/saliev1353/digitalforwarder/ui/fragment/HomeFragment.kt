package com.saliev1353.digitalforwarder.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.digitalforwarder.data.model.home.CategoryDto
import com.saliev1353.digitalforwarder.data.model.home.FilialDto
import com.saliev1353.digitalforwarder.databinding.FragmentHomeBinding
import com.saliev1353.digitalforwarder.ui.other.adapter.category.CategoryAdapter
import com.saliev1353.digitalforwarder.ui.other.adapter.filial.FilialsAdapter


class HomeFragment : Fragment() {
    private val binding : FragmentHomeBinding by lazy{
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private val adapter : FilialsAdapter by lazy { FilialsAdapter() }
    private val categoryAdapter : CategoryAdapter by lazy { CategoryAdapter() }
    private val itemList = listOf(
        FilialDto( "Globus" ,"адрес"),
        FilialDto( "Oazis", "адрес"),
        FilialDto( "Market","адрес"),
        FilialDto( "Wildberries", "адрес"),
        FilialDto( "Frunze", "адрес"),
        FilialDto( "Арзан", "адрес"),
        FilialDto( "Кайырма", "адрес"),
        FilialDto( "Globus Osh", "адрес"),
        FilialDto( "Globus Nokat", "адрес"),
        FilialDto( "Alibaba", "адрес"),
        FilialDto( "Ali express", "адрес"),
        FilialDto( "Faberlic" , "адрес"),
    )

    private val categoryList = listOf(
        CategoryDto("Напитки"),
        CategoryDto("Малочная продукция"),
        CategoryDto("Мясное"),
        CategoryDto("Фрукты"),
        CategoryDto("Овощи"),
        CategoryDto("ягоды"),
        CategoryDto("Моющие"),
        CategoryDto("Для красоты"),
        CategoryDto("Грибное"),
        CategoryDto("Орехи"),
        CategoryDto("Рыбопродукты"),
        CategoryDto("Хлебобулочные изделия"),
        CategoryDto("Пищевые жиры"),
        CategoryDto("Макаронные изделия"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.rvBranches.adapter = adapter
        adapter.submitList(itemList)
        binding.rvCategory.adapter = categoryAdapter
        categoryAdapter.submitList(categoryList)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }


}