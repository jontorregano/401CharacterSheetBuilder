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
        val dndIntent = Intent(this, dndPage5Activity::class.java)

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
                        dndAlignmentDesc.text = "Creatures can be counted on to do " +
                                "the right thing as expected by society. \n\nGold dragons, " +
                                "paladins, and most dwarves are lawful good."
                        dndAlignment.text = "Lawful Good (LG)"
                    }
            }
            when (view.getId()) {
                R.id.dndNG ->
                    if (checked) {
                        dndAlignmentDesc.text = "Folk do the best they can to help" +
                                "others according to their needs. \n\nMany celestials, some " +
                                "cloud giants, and most gnomes are neutral good."
                        dndAlignment.text = "Neutral Good (NG)"
                    }
            }
            when (view.getId()) {
                R.id.dndCG ->
                    if (checked) {
                        dndAlignmentDesc.text = "Creatures act as their conscience" +
                                "directs, with little regard for what others expect. \n\nCopper " +
                                "dragons, many elves, and unicorns are chaotic good."
                        dndAlignment.text = "Chaotic Good (CG)"
                    }
            }
            when (view.getId()) {
                R.id.dndLN ->
                    if (checked) {
                        dndAlignmentDesc.text = "Individuals act in accordance" +
                                "with law, tradition, or personal codes. \n\nMany monks and " +
                                "some wizards are lawful neutral."
                        dndAlignment.text = "Lawful Neutral (LN)"
                    }
            }
            when (view.getId()) {
                R.id.dndTN ->
                    if (checked) {
                        dndAlignmentDesc.text = "The alignment of those who prefer to " +
                                "steer clear of moral questions and don't take sides, " +
                                "doing what seems best at the time. \n\nLizard-folk, most " +
                                "druids, and many humans are neutral."
                        dndAlignment.text = "True Neutral (N)"
                    }
            }
            when (view.getId()) {
                R.id.dndCN ->
                    if (checked) {
                        dndAlignmentDesc.text = "Creatures follow their whims, " +
                                "holding their personal freedom above all else.\n\n" +
                                "Many barbarians and rogues, and some bards, are " +
                                "chaotic neutral."
                        dndAlignment.text = "Chaotic Neutral (CN)"
                    }
            }
            when (view.getId()) {
                R.id.dndLE ->
                    if (checked) {
                        dndAlignmentDesc.text = "Creatures methodically take what they " +
                                "want, within the limits of a code of tradition, loyalty, or " +
                                "order. \n\nDevils, blue dragons, and hobgoblins are lawful evil."
                        dndAlignment.text = "Lawful Evil (LE)"
                    }
            }
            when (view.getId()) {
                R.id.dndNE ->
                    if (checked) {
                        dndAlignmentDesc.text = "The alignment of those who do " +
                                "whatever they can get away with, without compassion or " +
                                "qualms. \n\nMany drow, some cloud giants, and yugoloths " +
                                "are neutral evil."
                        dndAlignment.text = "Neutral Evil (NE)"
                    }
            }
            when (view.getId()) {
                R.id.dndCE ->
                    if (checked) {
                        dndAlignmentDesc.text = "Creatures act with arbitrary " +
                                "violence, spurred by their greed, hatred, or bloodlust.\n\n" +
                                "Demons, red dragons, and orcs are chaotic evil."
                        dndAlignment.text = "Chaotic Evil (CE)"
                    }
            }
        }
    }
}
