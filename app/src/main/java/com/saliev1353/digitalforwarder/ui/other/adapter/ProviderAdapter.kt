package com.saliev1353.digitalforwarder.ui.other.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.saliev1353.digitalforwarder.data.model.provider.ProviderDto
import com.saliev1353.digitalforwarder.databinding.ItemProviderBinding

class ProviderAdapter : ListAdapter<ProviderDto, ProviderAdapter.ProviderViewHolder>(
    ProviderDiffUtill()
) {
    inner class ProviderViewHolder(private val binding: ItemProviderBinding) : ViewHolder(binding.root) {
        fun onBind(it: ProviderDto) {
            binding.itemFirstName.text = it.firstName
            binding.itemLastName.text = it.lastName
            binding.telNumber.text = it.number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProviderViewHolder {
        return ProviderViewHolder(ItemProviderBinding.inflate(LayoutInflater.from(parent.context) , parent,false))
    }

    override fun onBindViewHolder(holder: ProviderViewHolder, position: Int) {
        val providerModel = getItem(position)
        holder.onBind(providerModel)
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
