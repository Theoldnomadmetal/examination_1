package com.example.questionnineactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycle(recyclerViewActivity: RecyclerViewActivity) : RecyclerView.Adapter<ViewHolder>() {
    private var data = arrayListOf<DataClass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    fun update(data: ArrayList<DataClass>) {
        this.data = data
        notifyDataSetChanged()
    }

    fun deleteItem(pos: Int) {
        data.removeAt(pos)
        notifyItemRemoved(pos)
        notifyItemRangeChanged(pos, data.size)

    }

    fun addItem(item: DataClass) {
        data.add(1, item)
        notifyItemInserted(1)


    }
}

