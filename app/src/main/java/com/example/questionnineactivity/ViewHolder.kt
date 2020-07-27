package com.example.questionnineactivity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_adapter.view.*

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun bind(item:DataClass) {
        itemView.title1.text = item.title
        itemView.title2.text = item.title2

    }

}