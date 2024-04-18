package com.saliev1353.digitalforwarder.ui.other.adapter.onBoard

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.databinding.ItemOnBoardBinding
import com.saliev1353.digitalforwarder.ui.activity.reg.RegisterActivity

class OnBoardAdapter : RecyclerView.Adapter<OnBoardAdapter.BoardViewHolder>() {

    private val img = listOf(
        R.drawable.hello_world
    )

    private val title = listOf(
        "Добро пожаловать",
        "Title 2",
        "Title 3",
    )

    private val desc = listOf(
        "Admin",
        "Description 2",
        "Description 3",
    )


    inner class BoardViewHolder(private val binding: ItemOnBoardBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(pos: Int) {
            binding.imgOnBoard.setImageResource(img[pos])
            binding.txtDesc.text = desc[pos]
            binding.txtTitle.text = title[pos]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(
            ItemOnBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = img.size

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.onBind(position)
    }

}