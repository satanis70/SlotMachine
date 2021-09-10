package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.imageViewScrolling.IEventEnd

class MainActivity : AppCompatActivity() {

    internal lateinit var iEventEnd: IEventEnd
    val value: Int get() = Integer.parseInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}