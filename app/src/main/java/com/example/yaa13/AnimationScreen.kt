package com.example.yaa13

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation_screen.*


class AnimationScreen : AppCompatActivity() {
    companion object {
        const val COUNTER = "counter"
        const val SPEAKER = "speaker"
    }

    private lateinit var orderList: ArrayList<String>
    private lateinit var godList: ArrayList<String>
    private lateinit var manList: ArrayList<String>

    private lateinit var speakList: ArrayList<Speaker>

    private var manMode = true
    private var counterStep = 0
    private var stringStep = ""

    lateinit var animationInAction: AnimationAction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)

        speakList = intent.getSerializableExtra(SPEAKER) as ArrayList<Speaker>
        counterStep=intent.getIntExtra(COUNTER,0)
        if (counterStep<0) counterStep=0

        animationInAction = AnimationAction(this, mainLayout)
        generalOperation()
        goddy.setOnClickListener {
            if (!manMode) {
                generalOperation()
                manMode = true
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האדם לדבר", Toast.LENGTH_LONG).show()
            }
        }

        man.setOnClickListener {
            //operateMan(manList[round])
            if (manMode) {
                generalOperation()
                manMode = false
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האין סוף להגיב", Toast.LENGTH_LONG).show()

            }

        }

    }


    private fun generalOperation() {
        counterStep++

        manMode = counterStep % 2 != 0

        updateTitleSituation()

        val speaker = speakList[counterStep]
        if (manMode) {
            operateMan(speaker)
        } else {
            operateGoddy(speaker)
        }
        manMode=!manMode
    }

    private fun updateTitleSituation() {
        title_situation.text = "madMode=$manMode round=${(counterStep - 1) / 2}"
        counter_situation.text = "counter=$counterStep"
    }

    private fun operateGoddy(speaker: Speaker) {
        val st = speaker.taking
        val arr = st.split("\n")
        val size = arr.size

        when (size) {
            1 -> animationInAction.godTranslaion11A(speaker, counterStep)
            2 -> animationInAction.godTranslation20(arr, counterStep)
            3 -> animationInAction.godTranslaion30(arr, counterStep)
            4 -> animationInAction.godTranslaion40(arr, counterStep)
            5 -> animationInAction.godTranslaion50(arr, counterStep)
            6 -> animationInAction.godTranslaion60(arr, counterStep)
        }
    }

    private fun operateMan(speaker: Speaker) {
        val st = speaker.taking
        val arr = st.split("\n")
        val size = arr.size


        when (size) {
            1 -> animationInAction.manTranslation10(arr, counterStep)
            2 -> animationInAction.manTranslation20A(speaker, counterStep)
            3 -> animationInAction.manTranslaion30(arr, counterStep)
            4 -> animationInAction.manTranslaion40(arr, counterStep)
            5 -> animationInAction.manTranslaion50(arr, counterStep)
        }
    }

    private fun operateMan(st: String) {
        val arr = st.split("\n")
        val size = arr.size

        stringStep = orderList[counterStep]
        val arr1 = stringStep.split("#")

        when (size) {
            1 -> animationInAction.manTranslation10(arr, counterStep)
            //2 -> animationInAction.manTranslation20(arr, counterStep)
            2 -> animationInAction.manTranslation2A(arr, stringStep, counterStep)
            3 -> animationInAction.manTranslaion30(arr, counterStep)
            4 -> animationInAction.manTranslaion40(arr, counterStep)
            5 -> animationInAction.manTranslaion50(arr, counterStep)
        }
    }


}




