package com.example.yaa13

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_animation_screen.view.*


class AnimationAction(context: Context, val view: View) {

    var man1: TextView = view.manSpeaking1
    var man2: TextView = view.manSpeaking2
    var man3: TextView = view.manSpeaking3
    var man4: TextView = view.manSpeaking4
    var man5: TextView = view.manSpeaking5
    var man6: TextView = view.manSpeaking6
    var god1: TextView = view.godSpeaking1
    var god1A: TextView = view.godSpeaking1A
    var god2: TextView = view.godSpeaking2
    var god3: TextView = view.godSpeaking3
    var god4: TextView = view.godSpeaking4
    var god5: TextView = view.godSpeaking5
    var god6: TextView = view.godSpeaking6

    var wi: Float = Resources.getSystem().displayMetrics.widthPixels.toFloat()
    var hi: Float = Resources.getSystem().displayMetrics.heightPixels.toFloat()
    val ankaFont = Typeface.createFromAsset(context.assets, "fonts/anka.ttf")
    val danaFont = Typeface.createFromAsset(context.assets, "fonts/dana.otf")
    val shulikFont = Typeface.createFromAsset(context.assets, "fonts/shmulik.ttf")
    val stamFont = Typeface.createFromAsset(context.assets, "fonts/stam.ttf")
    val drugFont = Typeface.createFromAsset(context.assets, "fonts/drug.ttf")







    private fun styleTextView(tv: TextView, st: String, speaker: Speaker): TextView {

        var textView = tv

        with(speaker) {

            textView.setBackgroundColor(parseColor(colorBack))
            textView.setTextColor(parseColor(colorText))
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeText)
            when (styleText) {
                0 -> textView.typeface = Typeface.DEFAULT
                1 -> textView.typeface = ankaFont
                2 -> textView.typeface = danaFont
                3 -> textView.typeface = shulikFont
                4 -> textView.typeface = stamFont
                5 -> textView.typeface = drugFont
            }
            textView.setPadding(paddingLeft, paddingTop, paddingRight, paddingButton)
        }
        textView.text = st

        return textView
    }
    fun manTranslation10(speaker: Speaker) {
        initAllManTextview()
        var st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[0], speaker)
        ViewAnimator
            .animate(textView10)
           // .translationX(-wi / 2, 0f)
           // .translationY(-hi, 0f)
            .scale(0f, 1f)
            .duration(2000)
            .start()
    }
    fun manMove20(speaker: Speaker) {
        initAllManTextview()
        var st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[1], speaker)
        val textView11 = styleTextView(man2, arr[0], speaker)
        Util.move1(textView10,textView11)
    }
    fun manStatic10(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[0], speaker)
        when (ind) {
            0-> Util.scale10(textView10,1000)
            1-> Util.scale11(textView10,1000)
        }
    }

    fun manStatic20(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[1], speaker)
        val textView11 = styleTextView(man2, arr[0], speaker)
        when (ind) {
            0-> Util.scale20(textView11,textView10,1000)
            1-> Util.scale21(textView11,textView10,1000)
            2-> Util.scale22(textView11,textView10,600)
        }
    }
    fun manStatic30(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[2], speaker)
        val textView11 = styleTextView(man2, arr[1], speaker)
        val textView12 = styleTextView(man3, arr[0], speaker)
        when (ind) {
            0-> Util.scale30(textView12,textView11,textView10,1000)
            1-> Util.scale31(textView12,textView11,textView10,1000)
            2-> Util.scale32(textView12,textView11,textView10,600)
        }
    }
    fun manStatic40(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[3], speaker)
        val textView11 = styleTextView(man2, arr[2], speaker)
        val textView12 = styleTextView(man3, arr[1], speaker)
        val textView13 = styleTextView(man4, arr[0], speaker)
        when (ind) {
            0-> Util.scale40(textView13,textView12,textView11,textView10,1000)
            1-> Util.scale41(textView13,textView12,textView11,textView10,1000)
            2-> Util.scale42(textView13,textView12,textView11,textView10,600)
        }
    }

    fun manStatic50(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[4], speaker)
        val textView11 = styleTextView(man2, arr[3], speaker)
        val textView12 = styleTextView(man3, arr[2], speaker)
        val textView13 = styleTextView(man4, arr[1], speaker)
        val textView14 = styleTextView(man5, arr[0], speaker)
        when (ind) {
            0-> Util.scale50(textView14,textView13,textView12,textView11,textView10,1000)
            1-> Util.scale51(textView14,textView13,textView12,textView11,textView10,1000)
            2->Util.scale52(textView14, textView13, textView12, textView11, textView10, 1000)
        }
    }
    fun manStatic60(ind:Int,speaker: Speaker) {
        initAllManTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[5], speaker)
        val textView11 = styleTextView(man2, arr[4], speaker)
        val textView12 = styleTextView(man3, arr[3], speaker)
        val textView13 = styleTextView(man4, arr[2], speaker)
        val textView14 = styleTextView(man5, arr[1], speaker)
        val textView15 = styleTextView(man6, arr[0], speaker)
        when (ind) {
            0 -> Util.scale60(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
            1 -> Util.scale61(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
            2 -> Util.scale62(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
        }
    }
    fun godStatic10(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale10(    textView10, 1000)
            1 -> Util.scale11(   textView10, 1000)
        }
    }
    fun godStatic20(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god2, arr[1], speaker)
        val textView11 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale20(   textView11, textView10, 1000)
            1 -> Util.scale21(   textView11, textView10, 1000)
            2 -> Util.scale22(   textView11, textView10, 1000)
        }
    }
    fun godStatic30(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god3, arr[2], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        val textView12 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale30(  textView12, textView11, textView10, 1000)
            1 -> Util.scale31(  textView12, textView11, textView10, 1000)
            2 -> Util.scale32(  textView12, textView11, textView10, 1000)
        }
    }
    fun godStatic40(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god4, arr[3], speaker)
        val textView11 = styleTextView(god3, arr[2], speaker)
        val textView12 = styleTextView(god2, arr[1], speaker)
        val textView13 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale40( textView13, textView12, textView11, textView10, 1000)
            1 -> Util.scale41( textView13, textView12, textView11, textView10, 1000)
            2 -> Util.scale42( textView13, textView12, textView11, textView10, 1000)
        }
    }
    fun godStatic50(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god5, arr[4], speaker)
        val textView11 = styleTextView(god4, arr[3], speaker)
        val textView12 = styleTextView(god3, arr[2], speaker)
        val textView13 = styleTextView(god2, arr[1], speaker)
        val textView14 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale50(textView14, textView13, textView12, textView11, textView10, 1000)
            1 -> Util.scale51(textView14, textView13, textView12, textView11, textView10, 1000)
            2 -> Util.scale52(textView14, textView13, textView12, textView11, textView10, 1000)
        }
    }

    fun godStatic60(ind:Int,speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god6, arr[5], speaker)
        val textView11 = styleTextView(god5, arr[4], speaker)
        val textView12 = styleTextView(god4, arr[3], speaker)
        val textView13 = styleTextView(god3, arr[2], speaker)
        val textView14 = styleTextView(god2, arr[1], speaker)
        val textView15 = styleTextView(god1, arr[0], speaker)
        when (ind) {
            0 -> Util.scale60(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
            1 -> Util.scale61(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
            2 -> Util.scale62(textView15,textView14, textView13, textView12, textView11, textView10, 1000)
        }
    }

    fun godMove11A(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god1A, arr[0], speaker)
        Util.move1g(textView10,textView11)
    }





    fun manTranslation20A(speaker: Speaker) {
        initAllManTextview()
        var st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[1], speaker)
        val textView11 = styleTextView(man2, arr[0], speaker)
        Util.move1(textView10,textView11)
    }

    fun manTranslaion30(speaker: Speaker) {
        initAllManTextview()
        var st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[2], speaker)
        val textView11 = styleTextView(man2, arr[1], speaker)
        val textView12 = styleTextView(man3, arr[0], speaker)
        var dur = 1000L

        ViewAnimator
            .animate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun manTranslaion40(speaker: Speaker) {
        initAllManTextview()
        var st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(man1, arr[3], speaker)
        val textView11 = styleTextView(man2, arr[2], speaker)
        val textView12 = styleTextView(man3, arr[1], speaker)
        val textView13 = styleTextView(man4, arr[0], speaker)
        var dur = 1000L
        ViewAnimator
            .animate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .swing()
            .start()
    }

    fun godTranslaion11A(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god1A, arr[0], speaker)
        Util.move1g(textView10,textView11)

    }
    fun godTranslation20(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
             .translationX(-wi / 2, 0f)
            // .translationY(hi, 0f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .translationX(wi / 2, 0f)
           // .translationY(hi, 0f)
            .duration(2000)
            .start()
    }

    fun godTranslaion40(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        val textView12 = styleTextView(god3, arr[2], speaker)
        val textView13 = styleTextView(god4, arr[3], speaker)
        var dur = 1000L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun godTranslaion40A(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")
        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        val textView12 = styleTextView(god3, arr[2], speaker)
        val textView13 = styleTextView(god4, arr[3], speaker)
        var dur = 1000L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .textColor(parseColor("#3e64ff"), parseColor("#ff0000"))
            .duration(dur)
            .start()
    }


    fun godTranslaion60(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")

        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        val textView12 = styleTextView(god3, arr[2], speaker)
        val textView13 = styleTextView(god4, arr[3], speaker)
        val textView14 = styleTextView(god5, arr[4], speaker)
        val textView15 = styleTextView(god6, arr[5], speaker)
        var dur = 1000L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView15)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }
    fun godTranslaion60A(speaker: Speaker) {
        initAllGogTextview()
        val st = speaker.taking
        val arr = st.split("\n")

        val textView10 = styleTextView(god1, arr[0], speaker)
        val textView11 = styleTextView(god2, arr[1], speaker)
        val textView12 = styleTextView(god3, arr[2], speaker)
        val textView13 = styleTextView(god4, arr[3], speaker)
        val textView14 = styleTextView(god5, arr[4], speaker)
        val textView15 = styleTextView(god6, arr[5], speaker)
        var dur = 700L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView15)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView15)
            .duration(7000)
            .thenAnimate(textView15)
            .textColor(parseColor("#3e64ff"),parseColor("#ff6f5e"))
            .flipHorizontal()
            .duration(2000)
            .start()
    }







    private fun styleGod(tv: TextView, st: String, counter: Int): TextView {
        var textView = tv
        var colorText = Color.WHITE
        var styleText = Typeface.NORMAL
        var colorBack = Color.BLACK
        var sizeText = 14f

        textView.typeface = Typeface.DEFAULT

        when (counter) {
            2 -> {
                /*colorBack = parseColor("#ffeb3b")
                colorText = parseColor("#bdbdbd")*/
                colorBack = parseColor("#44000D")
                colorText = parseColor("#F9D276")
                textView.typeface = ankaFont
                sizeText = 28f
            }

        }

        textView.setBackgroundColor(colorBack)
        textView.setTextColor(colorText)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeText)
        textView.setTypeface(textView.typeface, styleText)
        textView.setPadding(30, 0, 30, 0)
        textView.text = st

        return textView
    }

    private fun styleMan(tv: TextView, st: String, counter: Int): TextView {
        var textView = tv
        var colorText = Color.WHITE
        var styleText = Typeface.NORMAL
        var colorBack = Color.BLACK
        var sizeText = 20f

        textView.typeface = Typeface.DEFAULT

        when (counter) {
            1 -> textView.typeface = danaFont
        }

        textView.setBackgroundColor(colorBack)
        textView.setTextColor(colorText)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeText)
        textView.setTypeface(textView.typeface, styleText)
        textView.setPadding(30, 0, 30, 0)


        textView.text = st
        // textView.gravity = Gravity.HORIZONTAL_GRAVITY_MASK

        return textView
    }

    private fun styleMan1(tv: TextView, st: String): TextView {

        // var arr = styleString.split("#")


        var textView = tv
        var colorText = Color.WHITE
        var styleText = Typeface.NORMAL
        var colorBack = Color.BLACK
        var sizeText = 20f

        textView.typeface = Typeface.DEFAULT

        /* when (counter) {
             1 -> textView.typeface = danaFont
         }*/

        textView.setBackgroundColor(colorBack)
        textView.setTextColor(colorText)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeText)
        textView.setTypeface(textView.typeface, styleText)
        textView.setPadding(30, 0, 30, 0)


        textView.text = st
        // textView.gravity = Gravity.HORIZONTAL_GRAVITY_MASK

        return textView
    }


    fun godTranslaion10(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView20 = styleGod(god1A, arr[0], counter)

        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }



    fun manTranslation20(arr: List<String>, counter: Int) {
        initAllManTextview()
        val textView10 = styleMan(man1, arr[1], counter)
        val textView11 = styleMan(man2, arr[0], counter)
        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }

    fun manTranslation2A(arr: List<String>) {
        initAllManTextview()
        /* val textView10 = styleMan(man1, arr[1], counter)
         val textView11 = styleMan(man2, arr[0], counter)*/
        val textView10 = styleMan1(man1, arr[1])
        val textView11 = styleMan1(man2, arr[0])
        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }


    /* fun manTranslaion30(arr: List<String>, counter: Int) {
         initAllManTextview()
         val textView10 = styleMan(man1, arr[2], counter)
         val textView11 = styleMan(man2, arr[1], counter)
         val textView12 = styleMan(man3, arr[0], counter)
         var dur = 1000L

         ViewAnimator
             .animate(textView12)
             .scale(0f, 1f)
             .duration(dur)
             .thenAnimate(textView11)
             .scale(0f, 1f)
             .duration(dur)
             .thenAnimate(textView10)
             .scale(0f, 1f)
             .duration(dur)
             .start()
     }
 */
    /*fun manTranslaion40(arr: List<String>, counter: Int) {
        initAllManTextview()
        val textView10 = styleMan(man1, arr[3], counter)
        val textView11 = styleMan(man2, arr[2], counter)
        val textView12 = styleMan(man3, arr[1], counter)
        val textView13 = styleMan(man4, arr[0], counter)
        var dur = 1000L

        ViewAnimator
            .animate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }*/

    fun manTranslaion50(arr: List<String>, counter: Int) {
        initAllManTextview()
        val textView10 = styleMan(man1, arr[4], counter)
        val textView11 = styleMan(man2, arr[3], counter)
        val textView12 = styleMan(man3, arr[2], counter)
        val textView13 = styleMan(man4, arr[1], counter)
        val textView14 = styleMan(man5, arr[0], counter)

       // Util.scale50(textView14,textView13,textView12,textView11,textView10,1000)
       // Util.scale51(textView14,textView13,textView12,textView11,textView10,1000)
        Util.scale52(textView14,textView13,textView12,textView11,textView10,1000)

    }


   /* fun godTranslaion10(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView20 = styleGod(god1A, arr[0], counter)
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }*/

    fun godTranslaion11(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView20 = styleGod(god1A, arr[0], counter)
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }

    /*fun godTranslation20(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView11 = styleGod(god2, arr[1], counter)
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(1)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }*/

    fun godTranslaion30(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView11 = styleGod(god2, arr[1], counter)
        val textView12 = styleGod(god3, arr[2], counter)
        var dur = 1000L

        ViewAnimator
            .animate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }

    /*fun godTranslaion40(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView11 = styleGod(god2, arr[1], counter)
        val textView12 = styleGod(god3, arr[2], counter)
        val textView13 = styleGod(god4, arr[3], counter)
        var dur = 1000L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }*/

    fun godTranslaion50(arr: List<String>, counter: Int) {
        initAllGogTextview()
        val textView10 = styleGod(god1, arr[0], counter)
        val textView11 = styleGod(god2, arr[1], counter)
        val textView12 = styleGod(god3, arr[2], counter)
        val textView13 = styleGod(god4, arr[3], counter)
        val textView14 = styleGod(god5, arr[4], counter)
        var dur = 1000L

        ViewAnimator
            .animate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }

   /* fun godTranslaion60(arr: List<String>, counter: Int) {
        initAllGogTextview()

        val textView10 = styleGod(god1, arr[0], counter)
        val textView11 = styleGod(god2, arr[1], counter)
        val textView12 = styleGod(god3, arr[2], counter)
        val textView13 = styleGod(god4, arr[3], counter)
        val textView14 = styleGod(god5, arr[4], counter)
        val textView15 = styleGod(god6, arr[5], counter)
        var dur = 1000L

        ViewAnimator
            .animate(textView15)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }*/

    fun initAllGogTextview() {
        ViewAnimator
            .animate(god1, god1A, god2, god3, god4, god5, god6)
            .scale(0f)
            .duration(1)
            .start()
    }

    fun initAllManTextview() {
        ViewAnimator
            .animate(man1, man2, man3, man4, man5, man6)
            .scale(0f)
            .duration(1)
            .start()
    }


}