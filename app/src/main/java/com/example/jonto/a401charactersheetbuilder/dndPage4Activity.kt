package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dndPage4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_page4)
    }

    fun dndPageThree (view: View){
        val dndIntent = Intent(this, dndPage4Activity::class.java)
        startActivity(dndIntent)
    }

    fun alignmentCheck (view: View){

    }
}
