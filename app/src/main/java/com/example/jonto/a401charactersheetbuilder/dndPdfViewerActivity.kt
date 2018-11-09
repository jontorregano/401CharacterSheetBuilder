package com.example.jonto.a401charactersheetbuilder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dnd_pdf_viewer.*

class dndPdfViewerActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_dnd_pdf_viewer)

        pdfView.fromAsset("Character Sheet - Form Fillable.pdf")
            .enableDoubletap(true)
            .spacing(0)
            .enableAntialiasing(true)
            .load()
    }
}

