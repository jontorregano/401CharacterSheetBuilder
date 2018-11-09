package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_dnd_page2.*
import kotlinx.android.synthetic.main.activity_dnd_start.*

class dndPage2Activity : AppCompatActivity() {

    companion object {
        const val CURRENT_RACE = "currentRace"
        const val CURRENT_NAME = "currentName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_page2)

        //val name = intent.getStringExtra(CURRENT_NAME)
        //val race = intent.getStringExtra(CURRENT_RACE)
    }

    fun dndPageTwo (view: View){
        val dndIntent = Intent(this, dndPage2Activity::class.java)
        startActivity(dndIntent)
    }

    fun dndPrev (view: View){
        val dndIntent = Intent(this, dndStartActivity::class.java)
        startActivity(dndIntent)
    }

    fun classCheck(view: View){
        if (view is RadioButton){

            val checked = view.isChecked

            when(view.getId()){
                R.id.dndBarbarian ->
                    if (checked){
                        dndClassDesc.text = "A fierce warrior of primitive background who can enter a battle rage"
                        dndClassAttr.text = "Hit Die: d12\n" +
                                "Primary Ability: Strength\n" +
                                "Saves: Strength & Constitution "
                        dndClass.text = "Barbarian"
                    }
            }
            when(view.getId()){
                R.id.dndBard ->
                    if (checked){
                        dndClassDesc.text = "An inspiring magician whose power echoes the music of creation"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Charisma\n" +
                                "Saves: Dexterity & Charisma"
                        dndClass.text = "Bard"
                    }
            }
            when(view.getId()){
                R.id.dndCleric ->
                    if (checked){
                        dndClassDesc.text = "A priestly champion who wields divine magic in service of a higher power"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Wisdom\n" +
                                "Saves: Wisdom & Charisma"
                        dndClass.text = "Cleric"
                    }
            }
            when(view.getId()){
                R.id.dndDruid ->
                    if (checked){
                        dndClassDesc.text = "A priest of the Old Faith, wielding the powers of nature and adopting animal forms"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Wisdom\n" +
                                "Saves: Intelligence & Wisdom "
                        dndClass.text = "Druid"
                    }
            }
            when(view.getId()){
                R.id.dndDruid ->
                    if (checked){
                        dndClassDesc.text = "A priest of the Old Faith, wielding the powers of nature and adopting animal forms"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Wisdom\n" +
                                "Saves: Intelligence & Wisdom "
                        dndClass.text = "Druid"
                    }
            }
            when(view.getId()){
                R.id.dndFighter ->
                    if (checked){
                        dndClassDesc.text = "A master of martial combat, skilled with a variety of weapons and armor"
                        dndClassAttr.text = "Hit Die: d10\n" +
                                "Primary Ability: Strength or Dexterity\n" +
                                "Saves: Strength & Constitution"
                        dndClass.text = "Fighter"
                    }
            }
            when(view.getId()){
                R.id.dndMonk ->
                    if (checked){
                        dndClassDesc.text = "A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Dexterity & Wisdom\n" +
                                "Saves: Strength & Dexterity"
                        dndClass.text = "Monk"
                    }
            }
            when(view.getId()){
                R.id.dndPaladin ->
                    if (checked){
                        dndClassDesc.text = "A holy warrior bound to a sacred oath"
                        dndClassAttr.text = "Hit Die: d10\n" +
                                "Primary Ability: Strength & Charisma\n" +
                                "Saves: Wisdom & Charisma"
                        dndClass.text = "Paladin"
                    }
            }
            when(view.getId()){
                R.id.dndRanger ->
                    if (checked){
                        dndClassDesc.text = "A warrior who combats threats on the edges of civilization"
                        dndClassAttr.text = "Hit Die: d10\n" +
                                "Primary Ability: Dexterity & Wisdom\n" +
                                "Saves: Strength & Dexterity\n"
                        dndClass.text = "Ranger"
                    }
            }
            when(view.getId()){
                R.id.dndRouge ->
                    if (checked){
                        dndClassDesc.text = "A scoundrel who uses stealth and trickery to overcome obstacles and enemies"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Dexterity\n" +
                                "Saves: Dexterity & Intelligence"
                        dndClass.text = "Rouge"
                    }
            }
            when(view.getId()){
                R.id.dndSorcerer ->
                    if (checked){
                        dndClassDesc.text = "A spellcaster who draws on inherent magic from a gift or bloodline"
                        dndClassAttr.text = "Hit Die: d6\n" +
                                "Primary Ability: Charisma\n" +
                                "Saves: Constitution & Charisma"
                        dndClass.text = "Sorcerer"
                    }
            }
            when(view.getId()){
                R.id.dndWarlock ->
                    if (checked){
                        dndClassDesc.text = "A wielder of magic that is derived from a bargain with an extraplanar entity"
                        dndClassAttr.text = "Hit Die: d8\n" +
                                "Primary Ability: Charisma\n" +
                                "Saves: Wisdom & Charisma"
                        dndClass.text = "Warlock"
                    }
            }
            when(view.getId()){
                R.id.dndWizard ->
                    if (checked){
                        dndClassDesc.text = "A scholarly magic-user capable of manipulating the structures of reality"
                        dndClassAttr.text = "Hit Die: d6\n" +
                                "Primary Ability: Intelligence\n" +
                                "Saves: Intelligence & Wisdom"
                        dndClass.text = "Wizard"
                    }
            }
        }
    }
}
