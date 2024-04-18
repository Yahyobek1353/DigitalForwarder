package com.saliev1353.digitalforwarder.ui.other.adapter.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.saliev1353.digitalforwarder.data.model.home.CategoryDto
import com.saliev1353.digitalforwarder.databinding.ItemCategoryBinding

class CategoryAdapter: ListAdapter<CategoryDto, CategoryAdapter.CategoryViewHolder>(
CategoryDiffUtill()
) {
    inner class CategoryViewHolder(private val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(it : CategoryDto?){
            binding.categotyName.text = it?.categoryName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ItemCategoryBinding.inflate(LayoutInflater.from(parent.context) , parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val CategoryModel = getItem(position)
        holder.onBind(CategoryModel)
    }
}

class CategoryDiffUtill : DiffUtil.ItemCallback<CategoryDto>() {
    override fun areItemsTheSame(oldItem: CategoryDto, newItem: CategoryDto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CategoryDto, newItem: CategoryDto): Boolean {
        return oldItem == newItem
    }

}
