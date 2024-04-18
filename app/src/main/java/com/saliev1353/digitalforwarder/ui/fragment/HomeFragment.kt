package com.saliev1353.digitalforwarder.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.data.model.home.CategoryDto
import com.saliev1353.digitalforwarder.data.model.home.FilialDto
import com.saliev1353.digitalforwarder.databinding.FragmentHomeBinding
import com.saliev1353.digitalforwarder.ui.other.adapter.category.CategoryAdapter
import com.saliev1353.digitalforwarder.ui.other.adapter.filial.FilialsAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private val binding : FragmentHomeBinding by lazy{
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private val adapter : FilialsAdapter by lazy { FilialsAdapter() }
    private val categoryAdapter : CategoryAdapter by lazy { CategoryAdapter() }
    private val itemList = listOf(
        FilialDto( "Globus"),
        FilialDto( "Oazis"),
        FilialDto( "Market"),
        FilialDto( "Wildberries"),
        FilialDto( "Frunze"),
        FilialDto( "Арзан"),
        FilialDto( "Кайырма"),
        FilialDto( "Globus Osh"),
        FilialDto( "Globus Nokat"),
        FilialDto( "Alibaba"),
        FilialDto( "Ali express"),
        FilialDto( "Faberlic"),
    )

    val categoryList = listOf(
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
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }


}