package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("DEBUG_TAG", "onCreate called" )
        val data = Array(10) { i -> (i*i).toString()}
        val adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1,
            data)
        list_view.adapter = adapter
        list_view.setOnItemClickListener{adapter, view, position, id ->
            (view as TextView).text = "Clicked"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("DEBUG_TAG", "onStart called" )
    }

    override fun onPause() {
        super.onPause()
        Log.d("DEBUG_TAG", "onPause called" )
    }

    override fun onResume() {
        super.onResume()
        Log.d("DEBUG_TAG", "onResume called" )
    }

    override fun onStop() {
        super.onStop()
        Log.d("DEBUG_TAG", "onStop called" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG_TAG", "onDestroy called" )
    }



}
