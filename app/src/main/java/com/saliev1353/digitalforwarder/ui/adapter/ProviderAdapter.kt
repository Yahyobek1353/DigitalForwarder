package com.saliev1353.digitalforwarder.ui.adapter


import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.saliev1353.digitalforwarder.data.model.provider.ProviderDto
import com.saliev1353.digitalforwarder.databinding.ActivityMainBinding
import com.saliev1353.digitalforwarder.databinding.ItemProviderBinding

class ProviderAdapter : ListAdapter<ProviderDto, ProviderAdapter.ProviderViewHolder>(ProviderDiffUtill()) {
    inner class ProviderViewHolder(private val binding: ItemProviderBinding) : ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProviderViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProviderViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

class ProviderDiffUtill : DiffUtil.ItemCallback<ProviderDto>() {
    override fun areItemsTheSame(oldItem: ProviderDto, newItem: ProviderDto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ProviderDto, newItem: ProviderDto): Boolean {
        return oldItem == newItem
    }

}
