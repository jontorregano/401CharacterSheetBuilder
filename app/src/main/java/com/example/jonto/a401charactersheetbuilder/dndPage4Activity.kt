package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_dnd_page4.*

class dndPage4Activity : AppCompatActivity() {

    companion object {
        const val CURRENT_RACE = "currentRace"
        const val CURRENT_NAME = "currentName"
        const val CURRENT_CLASS = "currentClass"
        const val CURRENT_ALIGNMENT = "currentAlignment"
        const val CURRENT_STR = "currentStr"
        const val CURRENT_DEX = "currentDex"
        const val CURRENT_CON = "currentCon"
        const val CURRENT_INT = "currentInt"
        const val CURRENT_WIS = "currentWis"
        const val CURRENT_CHA = "currentCha"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_page4)
    }

    fun dndPageNext(view: View) {
        val dndIntent = Intent(this, dndPlayActivity::class.java)

        val name = intent.getStringExtra(dndPage3Activity.CURRENT_NAME)
        val race = intent.getStringExtra(dndPlayActivity.CURRENT_RACE)
        val clas = intent.getStringExtra(dndPlayActivity.CURRENT_CLASS)
        val str = intent.getStringExtra(dndPlayActivity.CURRENT_STR)
        val dex = intent.getStringExtra(dndPlayActivity.CURRENT_DEX)
        val con = intent.getStringExtra(dndPlayActivity.CURRENT_CON)
        val int = intent.getStringExtra(dndPlayActivity.CURRENT_INT)
        val wis = intent.getStringExtra(dndPlayActivity.CURRENT_WIS)
        val cha = intent.getStringExtra(dndPlayActivity.CURRENT_CHA)


        val currentAlignment = dndAlignment.text.toString()
        dndIntent.putExtra(dndPage4Activity.CURRENT_ALIGNMENT, currentAlignment)

        val currentName = name
        dndIntent.putExtra(dndPage4Activity.CURRENT_NAME, currentName)

        val currentRace = race
        dndIntent.putExtra(dndPage4Activity.CURRENT_RACE, currentRace)

        val currentClass = clas
        dndIntent.putExtra(dndPage4Activity.CURRENT_CLASS, currentClass)

        val currentStr = str
        dndIntent.putExtra(dndPage4Activity.CURRENT_STR, currentStr)

        val currentDex = dex
        dndIntent.putExtra(dndPage4Activity.CURRENT_DEX, currentDex)

        val currentCon = con
        dndIntent.putExtra(dndPage4Activity.CURRENT_CON, currentCon)

        val currentInt = int
        dndIntent.putExtra(dndPage4Activity.CURRENT_INT, currentInt)

        val currentWis = wis
        dndIntent.putExtra(dndPage4Activity.CURRENT_WIS, currentWis)

        val currentCha = cha
        dndIntent.putExtra(dndPage4Activity.CURRENT_CHA, currentCha)

        startActivity(dndIntent)
    }

    fun alignmentCheck(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.dndLG ->
                    if (checked) {
                        dndAlignment.text = "Lawful Good"
                    }
            }
            when (view.getId()) {
                R.id.dndNG ->
                    if (checked) {
                        dndAlignment.text = "Neutral Good"
                    }
            }
            when (view.getId()) {
                R.id.dndCG ->
                    if (checked) {
                        dndAlignment.text = "Chaotic Good"
                    }
            }
            when (view.getId()) {
                R.id.dndLN ->
                    if (checked) {
                        dndAlignment.text = "Lawful Neutral"
                    }
            }
            when (view.getId()) {
                R.id.dndTN ->
                    if (checked) {
                        dndAlignment.text = "True Neutral"
                    }
            }
            when (view.getId()) {
                R.id.dndCN ->
                    if (checked) {
                        dndAlignment.text = "Chaotic Neutral"
                    }
            }
            when (view.getId()) {
                R.id.dndLE ->
                    if (checked) {
                        dndAlignment.text = "Lawful Evil"
                    }
            }
            when (view.getId()) {
                R.id.dndNE ->
                    if (checked) {
                        dndAlignment.text = "Neutral Evil"
                    }
            }
            when (view.getId()) {
                R.id.dndCN ->
                    if (checked) {
                        dndAlignment.text = "Chaotic Evil"
                    }
            }
        }
    }
}
