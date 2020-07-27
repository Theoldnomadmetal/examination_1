package com.example.questionnineactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class QuestionNineActivity : AppCompatActivity() {

    var btn1:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_nine_activity)
        setupViews()

    }
    private fun setupViews(){
        btn1 = findViewById(R.id.btn1)
    }
    private fun setupListeners(){
        btn1?.setOnClickListener {
            val intent = Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }

}