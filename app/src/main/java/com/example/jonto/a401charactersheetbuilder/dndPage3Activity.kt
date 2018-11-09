package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jonto.a401charactersheetbuilder.R.id.*
import kotlinx.android.synthetic.main.activity_dnd_page2.*
import kotlinx.android.synthetic.main.activity_dnd_page3.*
import java.util.*

class dndPage3Activity : AppCompatActivity() {

    companion object {
        const val CURRENT_RACE = "currentRace"
        const val CURRENT_NAME = "currentName"
        const val CURRENT_CLASS = "currentClass"
        const val CURRENT_STR = "currentStr"
        const val CURRENT_DEX = "currentDex"
        const val CURRENT_CON = "currentCon"
        const val CURRENT_INT = "currentInt"
        const val CURRENT_WIS = "currentWis"
        const val CURRENT_CHA = "currentCha"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_page3)

    }

    fun dndPageExport (view: View){
        val dndIntent = Intent(this, dndPdfViewerActivity::class.java)

        val name = intent.getStringExtra(dndPage3Activity.CURRENT_NAME)
        val race = intent.getStringExtra(dndPage3Activity.CURRENT_RACE)
        val clas = intent.getStringExtra(dndPage3Activity.CURRENT_CLASS)

        val currentName = name
        dndIntent.putExtra(dndPage3Activity.CURRENT_NAME, currentName)

        val currentRace = race
        dndIntent.putExtra(dndPage3Activity.CURRENT_RACE, currentRace)

        val currentClass = clas
        dndIntent.putExtra(dndPage3Activity.CURRENT_CLASS, currentClass)

        startActivity(dndIntent)
    }

    fun dndPrev (view: View){
        val dndIntent = Intent(this, dndStartActivity::class.java)
        startActivity(dndIntent)
    }

    fun dndRandStr(view:View){
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if(race == "Dragonborn"){
            val statFinal = statFinal + 2
            dndStrResult.text = "Strength and Dragonborn Bonus + 2: " + Integer.toString(statFinal)
        } else if(race == "Goliath"){
            val statFinal = statFinal + 2
            dndStrResult.text = "Strength and Goliath Bonus + 2: " + Integer.toString(statFinal)
        } else if (race == "Human") {
            val statFinal = statFinal + 1
            dndStrResult.text = "Strength and Human Bonus + 1: " + Integer.toString(statFinal)
        }
        else {
            dndStrResult.text = "Strength: " + Integer.toString(statFinal)
        }
    }

    fun dndRandDex(view:View) {
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if (race == "Elf") {
            val statFinal = statFinal + 2
            dndDexResult.text = "Dexterity and Elf Bonus + 2: " + Integer.toString(statFinal)
        } else if (race == "Halfling") {
            val statFinal = statFinal + 2
            dndDexResult.text = "Dexterity and Halfling Bonus + 2: " + Integer.toString(statFinal)
        } else if (race == "Human") {
            val statFinal = statFinal + 1
            dndDexResult.text = "Dexterity and Human Bonus + 1: " + Integer.toString(statFinal)
        }
        else {
            dndDexResult.text = "Dexterity: " + Integer.toString(statFinal)
        }
    }

    fun dndRandCon(view:View) {
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if (race == "Dwarf") {
            val statFinal = statFinal + 2
            dndResultCon.text = "Constitution and Dwarf Bonus + 2: " + Integer.toString(statFinal)
        } else if (race == "Goliath") {
            val statFinal = statFinal + 1
            dndResultCon.text = "Constitution and Goliath Bonus + 1: " + Integer.toString(statFinal)
        } else if (race == "Human") {
            val statFinal = statFinal + 1
            dndResultCon.text = "Constitution and Human Bonus + 1: " + Integer.toString(statFinal)
        }
        else {
            dndResultCon.text = "Constitution: " + Integer.toString(statFinal)
        }
    }

    fun dndRandInt(view:View) {
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if (race == "Gnome") {
            val statFinal = statFinal + 2
            dndResultInt.text = "Intelligence and Gnome Bonus + 2: " + Integer.toString(statFinal)
        } else if (race == "Tiefling"){
            val statFinal = statFinal + 1
            dndResultInt.text = "Intelligence and Tiefling Bonus + 1: " + Integer.toString(statFinal)
        }
        else if (race == "Human"){
            val statFinal = statFinal + 1
            dndResultInt.text = "Intelligence and Human Bonus + 1: " + Integer.toString(statFinal)
        }
        else {
            dndResultInt.text = "Intelligence: " + Integer.toString(statFinal)
        }
    }

    fun dndRandWis(view:View){
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if (race == "Human"){
            val statFinal = statFinal + 1
            dndResultWis.text = "Wisdom and Human Bonus + 1: " + Integer.toString(statFinal)
        } else {
            dndResultWis.text = "Wisdom: " + Integer.toString(statFinal)
        }
    }

    fun dndRandCha(view:View){
        var race = intent.getStringExtra(CURRENT_RACE)

        val random = Random()
        var randomInt = 0

        randomInt = random.nextInt(16)
        val statFinal = randomInt + 3

        if(race == "Dragonborn"){
            val statFinal = statFinal + 1
            dndResultCha.text = "Charisma and Dragonborn Bonus + 1: " + Integer.toString(statFinal)
        } else if (race == "Tiefling"){
            val statFinal = statFinal + 2
            dndResultCha.text = "Charisma and Tiefling Bonus + 2: " + Integer.toString(statFinal)
        }  else if (race == "Human"){
            val statFinal = statFinal + 1
            dndResultCha.text = "Charisma and Human Bonus + 1: " + Integer.toString(statFinal)
        }
        else {
            dndResultCha.text = "Charisma: " + Integer.toString(statFinal)
        }
    }
}
