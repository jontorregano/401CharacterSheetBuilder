package com.example.jonto.a401charactersheetbuilder

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Context
import kotlinx.android.synthetic.main.activity_dnd_play.*
import java.io.File
import java.io.FileOutputStream
import java.security.AccessController.getContext
import android.util.Log

class dndPlayActivity : AppCompatActivity() {

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
        const val CURRENT_ALIGNMENT = "currentAlignment"
        const val CURRENT_BACKSTORY = "currentBackstory"
    }

    fun dndBeginning (view: View){
        val dndIntent = Intent(this, HomeActivity::class.java)
        startActivity(dndIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_play)

        var race = intent.getStringExtra(dndPlayActivity.CURRENT_RACE)
        var name = intent.getStringExtra(dndPlayActivity.CURRENT_NAME)
        var clas = intent.getStringExtra(dndPlayActivity.CURRENT_CLASS)
        var str = intent.getStringExtra(dndPlayActivity.CURRENT_STR)
        var dex = intent.getStringExtra(dndPlayActivity.CURRENT_DEX)
        var con = intent.getStringExtra(dndPlayActivity.CURRENT_CON)
        var int = intent.getStringExtra(dndPlayActivity.CURRENT_INT)
        var wis = intent.getStringExtra(dndPlayActivity.CURRENT_WIS)
        var cha = intent.getStringExtra(dndPlayActivity.CURRENT_CHA)
        var alignment = intent.getStringExtra(dndPlayActivity.CURRENT_ALIGNMENT)
        var backstory = intent.getStringExtra(dndPlayActivity.CURRENT_BACKSTORY)


        dndPlayHeader.text = name + "'s Sheet"
        dndRace.text = race
        dndClass.text = clas
        dndStrScore.text = str
        dndDexScore.text = dex
        dndConScore.text = con
        dndIntScore.text = int
        dndWisScore.text = wis
        dndChaScore.text = cha
        dndAlignment.text = alignment
        dndBackstory.text = backstory

        if (clas == "Barbarian"){
            val dndHP = 12
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Bard"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Cleric"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Druid"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Fighter"){
            val dndHP = 10
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Monk"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Paladin"){
            val dndHP = 10
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Ranger"){
            val dndHP = 10
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Rouge"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Sorcerer"){
            val dndHP= 6
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Warlock"){
            val dndHP = 8
            dndHealth.text = Integer.toString(dndHP)
        }
        if (clas == "Wizard"){
            val dndHP = 6
            dndHealth.text = Integer.toString(dndHP)
        }

        if(str == "3"){
            dndStrMod.text = "-4"
        }
        if(str == "4"){
            dndStrMod.text = "-2"
        }
        if(str == "5"){
            dndStrMod.text = "-3"
        }
        if(str == "6"){
            dndStrMod.text = "-2"
        }
        if(str == "7"){
            dndStrMod.text = "-2"
        }
        if(str == "8"){
            dndStrMod.text = "-1"
        }
        if(str == "9"){
            dndStrMod.text = "-1"
        }
        if(str == "10"){
            dndStrMod.text = "0"
        }
        if(str == "11"){
            dndStrMod.text = "0"
        }
        if(str == "12"){
            dndStrMod.text = "+1"
        }
        if(str == "13"){
            dndStrMod.text = "+1"
        }
        if(str == "14"){
            dndStrMod.text = "+2"
        }
        if(str == "15"){
            dndStrMod.text = "+2"
        }
        if(str == "16"){
            dndStrMod.text = "+3"
        }
        if(str == "17"){
            dndStrMod.text = "+3"
        }
        if(str == "18"){
            dndStrMod.text = "+4"
        }
        if(str == "19"){
            dndStrMod.text = "+4"
        }
        if(str == "20"){
            dndStrMod.text = "+5"
        }

        if(dex == "3"){
            dndDexMod.text = "-4"
            val dndAC = 10 - 4
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "4"){
            dndDexMod.text = "-3"
            val dndAC = 10 - 3
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "5"){
            dndDexMod.text = "-3"
            val dndAC = 10 - 3
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "6"){
            dndDexMod.text = "-2"
            val dndAC = 10 - 2
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "7"){
            dndDexMod.text = "-2"
            val dndAC = 10 - 2
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "8"){
            dndDexMod.text = "-1"
            val dndAC = 10 - 1
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "9"){
            dndDexMod.text = "-1"
            val dndAC = 10 - 1
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "10"){
            dndDexMod.text = "0"
            val dndAC = 10
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "11"){
            dndDexMod.text = "0"
            val dndAC = 10
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "12"){
            dndDexMod.text = "+1"
            val dndAC = 10 + 1
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "13"){
            dndDexMod.text = "+1"
            val dndAC = 10 + 1
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "14"){
            dndDexMod.text = "+2"
            val dndAC = 10 + 2
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "15"){
            dndDexMod.text = "+2"
            val dndAC = 10 + 2
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "16"){
            dndDexMod.text = "+3"
            val dndAC = 10 + 3
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "17"){
            dndDexMod.text = "+3"
            val dndAC = 10 + 3
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "18"){
            dndDexMod.text = "+4"
            val dndAC = 10 + 4
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "19"){
            dndDexMod.text = "+4"
            val dndAC = 10 + 4
            dndArmor.text = Integer.toString(dndAC)
        }
        if(dex == "20"){
            dndDexMod.text = "+5"
            val dndAC = 10 + 5
            dndArmor.text = Integer.toString(dndAC)
        }

        if(con == "3"){
            dndConMod.text = "-4"
        }
        if(con == "4"){
            dndConMod.text = "-2"
        }
        if(con == "5"){
            dndConMod.text = "-3"
        }
        if(con == "6"){
            dndConMod.text = "-2"
        }
        if(con == "7"){
            dndConMod.text = "-2"
        }
        if(con == "8"){
            dndConMod.text = "-1"
        }
        if(con == "9"){
            dndConMod.text = "-1"
        }
        if(con == "10"){
            dndConMod.text = "0"
        }
        if(con == "11"){
            dndConMod.text = "0"
        }
        if(con == "12"){
            dndConMod.text = "+1"
        }
        if(con == "13"){
            dndConMod.text = "+1"
        }
        if(con == "14"){
            dndConMod.text = "+2"
        }
        if(con == "15"){
            dndConMod.text = "+2"
        }
        if(con == "16"){
            dndConMod.text = "+3"
        }
        if(con == "17"){
            dndConMod.text = "+3"
        }
        if(con == "18"){
            dndConMod.text = "+4"
        }
        if(con == "19"){
            dndConMod.text = "+4"
        }
        if(con == "20"){
            dndConMod.text = "+5"
        }

        if(int == "3"){
            dndIntMod.text = "-4"
        }
        if(int == "4"){
            dndIntMod.text = "-2"
        }
        if(int == "5"){
            dndIntMod.text = "-3"
        }
        if(int == "6"){
            dndIntMod.text = "-2"
        }
        if(int == "7"){
            dndIntMod.text = "-2"
        }
        if(int == "8"){
            dndIntMod.text = "-1"
        }
        if(int == "9"){
            dndIntMod.text = "-1"
        }
        if(int == "10"){
            dndIntMod.text = "0"
        }
        if(int == "11"){
            dndIntMod.text = "0"
        }
        if(int == "12"){
            dndIntMod.text = "+1"
        }
        if(int == "13"){
            dndIntMod.text = "+1"
        }
        if(int == "14"){
            dndIntMod.text = "+2"
        }
        if(int == "15"){
            dndIntMod.text = "+2"
        }
        if(int == "16"){
            dndIntMod.text = "+3"
        }
        if(int == "17"){
            dndIntMod.text = "+3"
        }
        if(int == "18"){
            dndIntMod.text = "+4"
        }
        if(int == "19"){
            dndIntMod.text = "+4"
        }
        if(int == "20"){
            dndIntMod.text = "+5"
        }

        if(wis == "3"){
            dndWisMod.text = "-4"
        }
        if(wis == "4"){
            dndWisMod.text = "-2"
        }
        if(wis == "5"){
            dndWisMod.text = "-3"
        }
        if(wis == "6"){
            dndWisMod.text = "-2"
        }
        if(wis == "7"){
            dndWisMod.text = "-2"
        }
        if(wis == "8"){
            dndWisMod.text = "-1"
        }
        if(wis == "9"){
            dndWisMod.text = "-1"
        }
        if(wis == "10"){
            dndWisMod.text = "0"
        }
        if(wis == "11"){
            dndWisMod.text = "0"
        }
        if(wis == "12"){
            dndWisMod.text = "+1"
        }
        if(wis == "13"){
            dndWisMod.text = "+1"
        }
        if(wis == "14"){
            dndWisMod.text = "+2"
        }
        if(wis == "15"){
            dndWisMod.text = "+2"
        }
        if(wis == "16"){
            dndWisMod.text = "+3"
        }
        if(wis == "17"){
            dndWisMod.text = "+3"
        }
        if(wis == "18"){
            dndWisMod.text = "+4"
        }
        if(wis == "19"){
            dndWisMod.text = "+4"
        }
        if(wis == "20"){
            dndWisMod.text = "+5"
        }

        if(cha == "3"){
            dndChaMod.text = "-4"
        }
        if(cha == "4"){
            dndChaMod.text = "-2"
        }
        if(cha == "5"){
            dndChaMod.text = "-3"
        }
        if(cha == "6"){
            dndChaMod.text = "-2"
        }
        if(cha == "7"){
            dndChaMod.text = "-2"
        }
        if(cha == "8"){
            dndChaMod.text = "-1"
        }
        if(cha == "9"){
            dndChaMod.text = "-1"
        }
        if(cha == "10"){
            dndChaMod.text = "0"
        }
        if(cha == "11"){
            dndChaMod.text = "0"
        }
        if(cha == "12"){
            dndChaMod.text = "+1"
        }
        if(cha == "13"){
            dndChaMod.text = "+1"
        }
        if(cha == "14"){
            dndChaMod.text = "+2"
        }
        if(cha == "15"){
            dndChaMod.text = "+2"
        }
        if(cha == "16"){
            dndChaMod.text = "+3"
        }
        if(cha == "17"){
            dndChaMod.text = "+3"
        }
        if(cha == "18"){
            dndChaMod.text = "+4"
        }
        if(cha == "19"){
            dndChaMod.text = "+4"
        }
        if(cha == "20"){
            dndChaMod.text = "+5"
        }
    }

    fun writeToFile(view: View){
        val path = getExternalFilesDir(null)
        Log.d("TAG", path.toString())
        val text: String = getText(view)

        val letDirectory = File(path, "LET")
        letDirectory.mkdirs()

        val file = File(letDirectory, "character_sheet.txt")

        file.appendText(text)
    }

    fun getText(view: View): String{
        return "NAME: \n" + CURRENT_NAME +
                "CLASS: \n" + CURRENT_CLASS +
                "RACE: \n" +  CURRENT_RACE +
                "ALIGNMENT: \n" + CURRENT_ALIGNMENT +
                "BACKSTORY: \n" + CURRENT_BACKSTORY +
                "STATS: \n" +
                "STR: \n" + CURRENT_STR +
                "DEX: \n" + CURRENT_DEX +
                "CON: \n" + CURRENT_CON +
                "INT: \n" + CURRENT_INT +
                "WIS: \n" + CURRENT_WIS +
                "CHA: \n" +  CURRENT_CHA

    }
}