package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_dnd_start.*

class dndStartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_start)
    }

    fun dndPageTwo (view: View){
        val dndIntent = Intent(this, dndPage2Activity::class.java)

        val currentName = dndName.text.toString()
        dndIntent.putExtra(dndPage2Activity.CURRENT_NAME, currentName)

        val currentRace = dndRace.text.toString()
        dndIntent.putExtra(dndPage2Activity.CURRENT_RACE, currentRace)

        startActivity(dndIntent)
    }

    fun dndHome (view: View){
        val dndIntent = Intent(this, HomeActivity::class.java)
        startActivity(dndIntent)
    }

    fun raceCheck(view: View){
        if (view is RadioButton){

            val checked = view.isChecked

            when(view.getId()){
                R.id.dndDragonborn ->
                    if (checked){
                        dndRaceDesc.text = "Dragonborn look very much like dragons standing erect in humanoid form, though they lack wings or a tail."
                        dndAttrInt.text = "Your Strength score increases by 2, and your Charisma score increases by 1."
                        dndRace.text = "Dragonborn"
                    }
            }
            when(view.getId()){
                R.id.dndDwarf ->
                    if (checked){
                        dndRaceDesc.text = "Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal."
                        dndAttrInt.text = "Your Constitution score increases by 2."
                        dndRace.text = "Dwarf"
                    }
            }
            when(view.getId()){
                R.id.dndElf ->
                    if (checked){
                        dndRaceDesc.text = "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it."
                        dndAttrInt.text = "+2 Dexterity, Darkvision, Keen Senses, Fey Ancestry, Trance"
                        dndRace.text = "Elf"
                    }
            }
            when(view.getId()){
                R.id.dndGoliath ->
                    if (checked){
                        dndRaceDesc.text = "Strong and reclusive, every day brings a new challenge to a goliath."
                        dndAttrInt.text = "+2 Strength, +1 Constitution, Natural Athlete, Stone's Endurance, Powerful Build, Mountain Born"
                        dndRace.text = "Goliath"
                    }
            }
            when(view.getId()){
                R.id.dndTiefling ->
                    if (checked){
                        dndRaceDesc.text = "To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling."
                        dndAttrInt.text = "Your Intelligence score increases by 1, and your Charisma score increases by 2."
                        dndRace.text = "Tiefling"
                    }
            }
            when(view.getId()){
                R.id.dndHuman ->
                    if (checked){
                        dndRaceDesc.text = "Humans are the most adaptable and ambitious people among the common races. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds."
                        dndAttrInt.text = "+1 to All Ability Scores, Extra Language"
                        dndRace.text = "Human"
                    }
            }
            when(view.getId()){
                R.id.dndHalfling ->
                    if (checked){
                        dndRaceDesc.text = "The diminutive halflings survive in a world full of larger creatures by avoiding notice or, barring that, avoiding offense."
                        dndAttrInt.text = "+2 Dexterity, Lucky, Brave, Halfling Nimbleness"
                        dndRace.text = "Halfling"
                    }
            }
            when(view.getId()){
                R.id.dndGnome ->
                    if (checked){
                        dndRaceDesc.text = "A gnome’s energy and enthusiasm for living shines through every inch of his or her tiny body."
                        dndAttrInt.text = "+2 Intelligence, Darkvision, Gnome Cunning"
                        dndRace.text = "Gnome"
                    }
            }

        }
    }

}
