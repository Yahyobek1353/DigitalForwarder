package com.saliev1353.digitalforwarder.ui.other.adapter.onBoard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saliev1353.digitalforwarder.R
import com.saliev1353.digitalforwarder.databinding.ItemOnBoardBinding

class OnBoardAdapter : RecyclerView.Adapter<OnBoardAdapter.BoardViewHolder>() {

    private val img = listOf(
        R.drawable.hello_world,
        R.drawable.pinguin
    )

    private val title = listOf(
        "Добро пожаловать",
        "Приятный интеряейс ждёт вас",
        "Title 3",
    )

    private val desc = listOf(
        "Hello world ! ",
        "Быстрая навигатся с помощь Bottom Nav",
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