package com.rjhwork.mycompany.patternenable.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rjhwork.mycompany.patternenable.R
import com.rjhwork.mycompany.patternenable.filling.Cheese

class DataAdapter: RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    private var cheeses = mutableListOf<Cheese>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cheeses[position])
    }

    override fun getItemCount(): Int = cheeses.size

    inner class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(cheese: Cheese) {
            itemView.findViewById<ImageView>(R.id.item_image).apply {
                this.setImageResource(cheese.image)
            }

            itemView.findViewById<TextView>(R.id.item_name).apply {
                this.text = cheese.name
            }
        }
    }

    fun setData(cheeses: List<Cheese>) {
        this.cheeses = cheeses.toMutableList()
    }

    fun removeItem(position: Int) {
        cheeses.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, cheeses.size)
    }
}