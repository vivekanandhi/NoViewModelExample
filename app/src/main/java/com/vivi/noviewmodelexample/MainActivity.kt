package com.vivi.noviewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel : CountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val txtview = findViewById<TextView>(R.id.count_text)

        viewModel= ViewModelProvider(this).get(CountViewModel::class.java)
        txtview.text=viewModel.getCurrentCount().toString()
        button.setOnClickListener {

            txtview.text=viewModel.getUpdatedCount().toString()
        }
    }
}