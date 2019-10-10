package com.example.yaa13

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yaa13.AnimationScreen.Companion.COUNTER
import com.example.yaa13.AnimationScreen.Companion.SPEAKER


class MainActivity : AppCompatActivity() {

    val ADAM = "-אדם-"
    val GOD = "-אלוהים-"

    lateinit var speakerList: ArrayList<Speaker>
    private var counter=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
        updateListSpeaker()
        sendData()
    }

    private fun updateListSpeaker() {

        counter=5

        for (ind in 0 until speakerList.size)


        when (ind) {
            2, 4 -> speakerList[ind] = updateSpeaker2(speakerList[ind])
        }
    }

    private fun updateSpeaker2(speaker: Speaker): Speaker {
        speaker.colorText = "#bdbdbd"
        speaker.colorBack = "#44000D"
        speaker.sizeText = 28f
        speaker.styleText = 1
        speaker.paddingTop = 50
        speaker.paddingButton = 30
        return speaker
    }


    private fun sendData() {
        val intent1 = Intent(this, AnimationScreen::class.java)


        intent1.putExtra(SPEAKER, speakerList)
        intent1.putExtra(COUNTER,counter-1)

        startActivity(intent1)
    }

    private fun getData() {
        var count = 0
        var text = applicationContext.assets.open("text10.txt").bufferedReader().use {
            it.readText()
        }
        text = text.replace("\r", "")
        var list1 = text.split(ADAM)
        speakerList = arrayListOf()
        var speaker = Speaker()
        speakerList.add(count, speaker)
        for (element in list1) {
            if (element != "" && element.length > 15) {
                var list2 = element.split(GOD)
                val st1 = improveString(list2[0])
                val st2 = improveString(list2[1])
                count++
                speaker = Speaker()
                speaker.whoSpeake = "man"
                speaker.taking = st1
                speakerList.add(count, speaker)
                count++
                speaker = Speaker()
                speaker.whoSpeake = "god"
                speaker.taking = st2
                speakerList.add(count, speaker)
            }
        }

    }

    private fun improveString(st: String) = st.substring(1, st.length - 1)
}
