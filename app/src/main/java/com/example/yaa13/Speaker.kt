package com.example.yaa13

import android.graphics.Color
import android.graphics.Typeface
import android.os.Parcelable
import java.io.Serializable

data class Speaker (
     var whoSpeake: String = "man",
     var taking: String = "tadam",
     var colorText: String = "#ffffff",
     var colorBack: String = "#000000",
     var styleText: Int = 0,
     var sizeText: Float =20f,
     var paddingLeft:Int=30,
     var paddingTop:Int=0,
     var paddingRight:Int=30,
     var paddingButton:Int=0

):Serializable


/*
class People : Serializable {
//your stuff
}*/

/*
data class Speaker (
    val counter:Int=0,
    val whoSpeake:String="man",
    val taking:String="tadam",
    val colorText:Int=Color.WHITE,
    val styleText:Int=Typeface.NORMAL,
    val sizeText:Float=20f,
    val colorBack:Int=Color.BLACK
)*/
