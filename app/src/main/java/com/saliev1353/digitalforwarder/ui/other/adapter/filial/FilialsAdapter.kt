package com.saliev1353.digitalforwarder.ui.other.adapter.filial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.saliev1353.digitalforwarder.data.model.home.FilialDto
import com.saliev1353.digitalforwarder.databinding.ItemFilialsBinding

class FilialsAdapter : ListAdapter<FilialDto, FilialsAdapter.FilialsViewHolder>(
ProviderDiffUtill()
) {
    inner class FilialsViewHolder(private val binding: ItemFilialsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(it : FilialDto?){
            binding.filialsName.text = it?.name
            binding.filialAdress.text = it?.adress
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilialsViewHolder {
        return FilialsViewHolder(ItemFilialsBinding.inflate(LayoutInflater.from(parent.context) , parent,false))
    }

    override fun onBindViewHolder(holder: FilialsViewHolder, position: Int) {
       val filialModel = getItem(position)
        holder.onBind(filialModel)
    }
}

class ProviderDiffUtill : DiffUtil.ItemCallback<FilialDto>() {
    override fun areItemsTheSame(oldItem: FilialDto, newItem: FilialDto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: FilialDto, newItem: FilialDto): Boolean {
        return oldItem == newItem
    }

}
