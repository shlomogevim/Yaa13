package com.example.yaa13

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.Typeface
import android.util.TypedValue
import android.view.View
import android.widget.TextView
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


    private fun styleGod(tv: TextView, st: String, counter: Int): TextView {
        var textView = tv
        var colorText = Color.WHITE
        var styleText = Typeface.NORMAL
        var colorBack = Color.BLACK
        var sizeText = 14f

        textView.typeface= Typeface.DEFAULT

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

        textView.typeface= Typeface.DEFAULT

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


    fun manTranslation10(arr: List<String>, counter: Int) {
        initAllManTextview()
        val textView10 = styleMan(man1, arr[0], counter)
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)
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

    fun manTranslaion30(arr: List<String>, counter: Int) {
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

    fun manTranslaion40(arr: List<String>, counter: Int) {
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
    }

    fun manTranslaion50(arr: List<String>, counter: Int) {
        initAllManTextview()
        val textView10 = styleMan(man1, arr[4], counter)
        val textView11 = styleMan(man2, arr[3], counter)
        val textView12 = styleMan(man3, arr[2], counter)
        val textView13 = styleMan(man4, arr[1], counter)
        val textView14 = styleMan(man5, arr[0], counter)
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
            .onStop {
                if (counter == 3) {
                    ViewAnimator
                        .animate(textView10)
                        .scale(1f, 0f, 1f)
                        .repeatCount(1)
                        .duration(1000)
                        .start()
                }
            }
            .duration(dur)
            .start()

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

    fun godTranslation20(arr: List<String>, counter: Int) {
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
    }

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

    fun godTranslaion40(arr: List<String>, counter: Int) {
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
    }

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

    fun godTranslaion60(arr: List<String>, counter: Int) {
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
    }

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