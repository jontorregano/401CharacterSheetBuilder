package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun pftoastTest(view: View){
        val myToast = Toast.makeText(this, "PF Test", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun sftoastTest(view: View){
        val myToast = Toast.makeText(this, "SF Test", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun dndStart (view: View){
        val dndIntent = Intent(this, dndStartActivity::class.java)
        startActivity(dndIntent)
    }
}
