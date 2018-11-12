package com.example.jonto.a401charactersheetbuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_dnd_page5.*

class dndPage5Activity : AppCompatActivity() {

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
        const val CURRENT_BACKSTORY = "currentBackstory"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnd_page5)
    }

    fun dndPageNext(view: View) {
        val dndIntent = Intent(this, dndPlayActivity::class.java)

        val name = intent.getStringExtra(dndPage3Activity.CURRENT_NAME)
        val race = intent.getStringExtra(dndPlayActivity.CURRENT_RACE)
        val clas = intent.getStringExtra(dndPlayActivity.CURRENT_CLASS)
        val alignment = intent.getStringExtra(dndPage4Activity.CURRENT_ALIGNMENT)
        val str = intent.getStringExtra(dndPlayActivity.CURRENT_STR)
        val dex = intent.getStringExtra(dndPlayActivity.CURRENT_DEX)
        val con = intent.getStringExtra(dndPlayActivity.CURRENT_CON)
        val int = intent.getStringExtra(dndPlayActivity.CURRENT_INT)
        val wis = intent.getStringExtra(dndPlayActivity.CURRENT_WIS)
        val cha = intent.getStringExtra(dndPlayActivity.CURRENT_CHA)


        val currentBackstory = dndBackstory.text.toString()
        dndIntent.putExtra(dndPage5Activity.CURRENT_BACKSTORY, currentBackstory)

        val currentAlignment = alignment
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

    fun backstoryCheck(view: View) {
        if (view is RadioButton) {

            val checked = view.isChecked

            when (view.getId()) {
                R.id.dndAcolyte ->
                    if (checked) {
                        dndBackstoryDesc.text = "You have spent your life in the service of a temple " +
                                "to a specific god or pantheon of gods, Vou act as an " +
                                "intermediary between the realm of the holy and the " +
                                "mortal world, performing sacred rites and offering " +
                                "sacrifices in order to conduct worshipers into the " +
                                "presence of the divine. Vou are not necessarily a " +
                                "cleric-performing sacred rites is not the same thing as " +
                                "channeling divine power"
                        dndBackstory.text = "Acolyte"
                    }
            }
            when (view.getId()) {
                R.id.dndCharlatan ->
                    if (checked) {
                        dndBackstoryDesc.text = "You have always had a way with people. You know " +
                                "what makes them tick. You can tease out their hearts' " +
                                "desires after a few minutes of conversation, and with a " +
                                "few leading questions you can read them like they were " +
                                "children's books. It's a useful talent, and one that you're " +
                                "perfectly willing to use for your advantage."
                        dndBackstory.text = "Charlatan"
                    }
            }
            when (view.getId()) {
                R.id.dndCriminal ->
                    if (checked) {
                        dndBackstoryDesc.text = "You are an experienced criminal will a history of " +
                                "breaking lhe law. You have spent a lot of lime among " +
                                "other criminals and still have contacts within The " +
                                "criminal underworld. You're far closer than most people " +
                                "lo lhe world of murder, theft, and violence that pervades " +
                                "lhe underbelly of civilization, and you have survived up to " +
                                "this point by following the rules and regulations of society.\n"
                        dndBackstory.text = "Criminal"
                    }
            }
            when (view.getId()) {
                R.id.dndEntertainer ->
                    if (checked) {
                        dndBackstoryDesc.text = "You thrive in front of an audience. You know how to " +
                                "entrance them, entertain them, and even inspire them. " +
                                "Your poetics can stir the hearts of those who hear you, " +
                                "awakening grief or joy, laughter or anger. Your music " +
                                "raises their spirits or captures their sorrow. Your dance " +
                                "steps captivate, your humor cuts to the quick. Whatever " +
                                "techniques you use, your art is your life."
                        dndBackstory.text = "Entertainer"
                    }
            }
            when (view.getId()) {
                R.id.dndFolkhero ->
                    if (checked) {
                        dndBackstoryDesc.text = "You come from a humble social rank, but you are " +
                                "destined for so much more. Already the people of " +
                                "your home village regard you as their champion, and " +
                                "your destiny calls you to stand against the tyrants and " +
                                "monsters that threaten the common folk everywhere.\n"
                        dndBackstory.text = "Folk Hero"
                    }
            }
            when (view.getId()) {
                R.id.dndGuildartisan ->
                    if (checked) {
                        dndBackstoryDesc.text = "Vou are a member of an artisan's guild, skilled in " +
                                "a particular field and closely associated with other " +
                                "artisans. Vou are a well-established part of the " +
                                "mercantile world, freed by talent and wealth from the " +
                                "constraints of a feudal social order. Vou learned your " +
                                "skills as an apprentice to a master artisan, under the " +
                                "sponsorship of your guild, until you became a master in " +
                                "your own right."
                        dndBackstory.text = "Guild Artisan"
                    }
            }
            when (view.getId()) {
                R.id.dndHermit ->
                    if (checked) {
                        dndBackstoryDesc.text = "You lived in seclusion-either in a sheltered community " +
                                "such as a monastery, or entirely alone-for a formative " +
                                "part of your life. In your time apart from the clamor of " +
                                "society, you found quiet, solitude, and perhaps some of " +
                                "the answers you were looking for"
                        dndBackstory.text = "Hermit"
                    }
            }
            when (view.getId()) {
                R.id.dndNoble ->
                    if (checked) {
                        dndBackstoryDesc.text = "You understand wealth, power, and privilege. You " +
                                "carry a noble title, and your family owns land, collects " +
                                "taxes, and wields significant political influence. You " +
                                "might be a pampered aristocrat unfamiliar with  "+
                                "work or discomfort, a former merchant just elevated " +
                                "to the nobility, or a disinherited scoundrel with a " +
                                "disproportionate sense of entitlement. Or you could be " +
                                "an honest, hard-working landowner who cares deeply " +
                                "about the people who live and work on your land, keenly " +
                                "aware of your responsibility to them"
                        dndBackstory.text = "Noble"
                    }
            }
            when (view.getId()) {
                R.id.dndOutlander ->
                    if (checked) {
                        dndBackstoryDesc.text = "You grew up in the wilds, far from civilization and the " +
                                "comforts of town and technology. You've witnessed the " +
                                "migration of herds larger than forests, survived weather " +
                                "more extreme than any city-dweller could comprehend, " +
                                "and enjoyed the solitude of being the only thinking " +
                                "creature for miles in any direction. The wilds are in " +
                                "your blood, whether you were a nomad, an explorer, a " +
                                "recluse use, a hunter-gatherer, or even a marauder. Even in " +
                                "places where you don'l know the specific features of the " +
                                "terrain, you know the ways of the wild."
                        dndBackstory.text = "Outlander"
                    }
            }
            when (view.getId()) {
                R.id.dndSage ->
                    if (checked) {
                        dndBackstoryDesc.text = "You spent years learning the lore of the multiverse. You " +
                                "scoured manuscripts, studied scrolls, and listened to the " +
                                "greatest experts on the subjects that interest you. Your " +
                                "efforts have made you a master in your fields of study."
                        dndBackstory.text = "Sage"
                    }
            }
            when (view.getId()) {
                R.id.dndSailor ->
                    if (checked) {
                        dndBackstoryDesc.text = "You sailed on a seagoing vessel for years. In that " +
                                "time, you faced down mighty storms, monsters of the " +
                                "deep, and those who wanted to sink your craft to the " +
                                "bottomless depths. Your first love is the distant line of " +
                                "the horizon, but the time has come to try your hand " +
                                "at something new."
                        dndBackstory.text = "Sailor"
                    }
            }
            when (view.getId()) {
                R.id.dndSoldier ->
                    if (checked) {
                        dndBackstoryDesc.text = "War has been your life for as long as you care to " +
                                "remember. You trained as a youth, studied the use of " +
                                "weapons and armor, learned basic survival techniques, " +
                                "including how to stay alive on the battlefield. You " +
                                "might have been part of a standing national army or a " +
                                "mercenary company, or perhaps a member of a local " +
                                "militia who rose to prominence during a recent war."
                        dndBackstory.text = "Soldier"
                    }
            }
            when (view.getId()) {
                R.id.dndUrchin ->
                    if (checked) {
                        dndBackstoryDesc.text = "You grew up on the streets alone, orphaned, and poor. " +
                                "You had no one to watch over you or to provide for " +
                                "you, so you learned to provide for yourself. You fought " +
                                "fiercely over food and kept a constant watch out for other " +
                                "desperate souls who might steal from you. Y&ou slept on " +
                                "rooftops and in alleyways, exposed to the elements, and " +
                                "endured sickness without the advantage of medicine or " +
                                "a place to recuperate. You've survived despite all odds, " +
                                "and did so through cunning, strength, speed, or some " +
                                "combination of each."
                        dndBackstory.text = "Urchin"
                    }
            }
        }
    }
}
