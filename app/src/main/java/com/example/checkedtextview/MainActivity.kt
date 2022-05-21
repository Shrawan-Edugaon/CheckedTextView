package com.example.checkedtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView

class MainActivity : AppCompatActivity() {
    lateinit var checkedTextView:CheckedTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkedTextView = findViewById(R.id.checkedText)

        checkedTextView.setOnClickListener {
            checkedTextView.toggle()
        }
    }
}