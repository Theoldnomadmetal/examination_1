package com.example.questionnineactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    private var btnAdd:Button? = null
    private var btnDelete:Button? = null
    private var recycler: RecyclerView? = null
    private val adapter = AdapterRecycle(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        setupViews()
        setupRecyclerView()
        setupListeners()
    }
    private fun setupViews(){
        btnAdd = findViewById(R.id.btn1)
        btnDelete = findViewById(R.id.btn2)
        recycler = findViewById(R.id.recycler)

    }
    private fun setupRecyclerView(){
        recycler?.adapter = adapter
        adapter.update(getData())
}


    private fun setupListeners(){
        btnDelete?.setOnClickListener {
            adapter.deleteItem(0)

        }
        btnAdd?.setOnClickListener {
            adapter.addItem(DataClass("New Album","New singer"))
        }
    }

    private fun getData(): ArrayList<DataClass> {
        val list = arrayListOf<DataClass>()
        for (i in 0..20){
            list.add(DataClass("Album $i","Singer"))
        }
        return list}}



