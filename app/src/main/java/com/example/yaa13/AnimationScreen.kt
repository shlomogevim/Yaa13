package com.example.yaa13

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation_screen.*
import kotlin.properties.Delegates


class AnimationScreen : AppCompatActivity() {
    companion object {
        const val MANNL = "manl"
        const val GODDL = "godl"
    }

    private lateinit var godList: ArrayList<String>
    private lateinit var manList: ArrayList<String>
    private var manMode = true
    private var sevev = 0
    private var counterSituation = 0


    lateinit var animationInAction :AnimationAction


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        manList = intent.getStringArrayListExtra(MANNL)
        godList = intent.getStringArrayListExtra(GODDL)
        animationInAction=AnimationAction(this,mainLayout)
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

        //  manMode = false
        // sevev = 6

        counterSituation++
        updateTitleSituation()

        val speaking: String
        if (manMode) {
            //Its man position
            speaking = manList[sevev]
            operateMan(speaking)
            manMode = false
        } else {
            // lts God position
            speaking = godList[sevev]
            operateGoddy(speaking)
            manMode = true
            sevev++

        }
    }

    private fun updateTitleSituation() {
        title_situation.text = "madMode=$manMode round=$sevev"
        counter_situation.text = "counter=$counterSituation"
    }

    private fun operateGoddy(st: String) {
        val arr = st.split("\n")
        val size = arr.size
        //  val animationInAction = AnimationAction(mainLayout)
        //initGod(size)
        when (size) {
            1 -> animationInAction.godTranslaion11(arr, counterSituation)
            2 -> animationInAction.godTranslation20(arr, counterSituation)
            3 -> animationInAction.godTranslaion30(arr, counterSituation)
            4 -> animationInAction.godTranslaion40(arr, counterSituation)
            5 -> animationInAction.godTranslaion50(arr, counterSituation)
            6 -> animationInAction.godTranslaion60(arr, counterSituation)
        }
    }



    private fun operateMan(st: String) {
        val arr = st.split("\n")
        val size = arr.size
        //  val animationInAction = AnimationAction(mainLayout)
        // initMan(size)
        when (size) {
            1 -> animationInAction.manTranslation10(arr, counterSituation)
            2 -> animationInAction.manTranslation20(arr, counterSituation)
            3 -> animationInAction.manTranslaion30(arr, counterSituation)
            4 -> animationInAction.manTranslaion40(arr, counterSituation)
            5 -> animationInAction.manTranslaion50(arr, counterSituation)
        }
    }
}




