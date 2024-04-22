package com.saliev1353.digitalforwarder.ui.other.adapter.report

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.saliev1353.digitalforwarder.data.model.price.PriceDto
import com.saliev1353.digitalforwarder.databinding.ItemReportBinding

class ReportAdapter : ListAdapter<PriceDto, ReportAdapter.ReportViewHolder>(
    PriseDiffUtill()
) {
    class ReportViewHolder (private val binding : ItemReportBinding) : ViewHolder(binding.root){
        fun onBind(it : PriceDto){
            binding.txtM.text = it.name
            binding.incomePrice.text = it.income
            binding.resultPrice.text = it.remove
            binding.allResultPrice.text = it.allPrice
        }
    }



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReportViewHolder {
        return  ReportViewHolder(ItemReportBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
      val model = getItem(position)
        holder.onBind(model)
    }
}
class PriseDiffUtill : DiffUtil.ItemCallback<PriceDto>() {
    override fun areItemsTheSame(oldItem: PriceDto, newItem: PriceDto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: PriceDto, newItem: PriceDto): Boolean {
        return oldItem == newItem
    }

}