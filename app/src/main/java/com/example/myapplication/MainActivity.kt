package com.example.myapplication

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    var random : Random = Random()

    var img1: Int = 0
    var img2: Int = 0
    var img3: Int = 0
    var img4: Int = 0
    var img5: Int = 0
    var img6: Int = 0
    var img7: Int = 0
    var img8: Int = 0
    var img9: Int = 0
    var img10: Int = 0
    var img11: Int = 0
    var img12: Int = 0
    var img13: Int = 0
    var img14: Int = 0
    var img15: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView_spin.setOnClickListener {

            imageView_icon1.setBackgroundResource(R.drawable.anim)
            val animationDrawable1: AnimationDrawable = imageView_icon1.background as AnimationDrawable
            animationDrawable1.start()

            imageView_icon2.setBackgroundResource(R.drawable.anim)
            val animationDrawable2: AnimationDrawable = imageView_icon2.background as AnimationDrawable
            animationDrawable2.start()

            imageView_icon3.setBackgroundResource(R.drawable.anim)
            val animationDrawable3: AnimationDrawable = imageView_icon3.background as AnimationDrawable
            animationDrawable3.start()

            imageView_icon4.setBackgroundResource(R.drawable.anim)
            val animationDrawable4: AnimationDrawable = imageView_icon4.background as AnimationDrawable
            animationDrawable4.start()

            imageView_icon5.setBackgroundResource(R.drawable.anim)
            val animationDrawable5: AnimationDrawable = imageView_icon5.background as AnimationDrawable
            animationDrawable5.start()

            imageView_icon6.setBackgroundResource(R.drawable.anim)
            val animationDrawable6: AnimationDrawable = imageView_icon6.background as AnimationDrawable
            animationDrawable6.start()

            imageView_icon7.setBackgroundResource(R.drawable.anim)
            val animationDrawable7: AnimationDrawable = imageView_icon7.background as AnimationDrawable
            animationDrawable7.start()

            imageView_icon8.setBackgroundResource(R.drawable.anim)
            val animationDrawable8: AnimationDrawable = imageView_icon8.background as AnimationDrawable
            animationDrawable8.start()

            imageView_icon9.setBackgroundResource(R.drawable.anim)
            val animationDrawable9: AnimationDrawable = imageView_icon9.background as AnimationDrawable
            animationDrawable9.start()

            imageView_icon10.setBackgroundResource(R.drawable.anim)
            val animationDrawable10: AnimationDrawable = imageView_icon10.background as AnimationDrawable
            animationDrawable10.start()

            imageView_icon11.setBackgroundResource(R.drawable.anim)
            val animationDrawable11: AnimationDrawable = imageView_icon11.background as AnimationDrawable
            animationDrawable11.start()

            imageView_icon12.setBackgroundResource(R.drawable.anim)
            val animationDrawable12: AnimationDrawable = imageView_icon12.background as AnimationDrawable
            animationDrawable12.start()

            imageView_icon13.setBackgroundResource(R.drawable.anim)
            val animationDrawable13: AnimationDrawable = imageView_icon13.background as AnimationDrawable
            animationDrawable13.start()

            imageView_icon14.setBackgroundResource(R.drawable.anim)
            val animationDrawable14: AnimationDrawable = imageView_icon14.background as AnimationDrawable
            animationDrawable14.start()

            imageView_icon15.setBackgroundResource(R.drawable.anim)
            val animationDrawable15: AnimationDrawable = imageView_icon15.background as AnimationDrawable
            animationDrawable15.start()

            Handler(Looper.getMainLooper()).postDelayed({
                animationDrawable1.stop()
                animationDrawable2.stop()
                animationDrawable3.stop()
                animationDrawable4.stop()
                animationDrawable5.stop()
                animationDrawable6.stop()
                animationDrawable7.stop()
                animationDrawable8.stop()
                animationDrawable9.stop()
                animationDrawable10.stop()
                animationDrawable11.stop()
                animationDrawable12.stop()
                animationDrawable13.stop()
                animationDrawable14.stop()
                animationDrawable15.stop()
                setImage()
                getScore()
            },1500)
        }
    }

    private fun getScore() {

    }

    private fun setImage() {
        img1 = random.nextInt(14)
        img2 = random.nextInt(14)
        img3 = random.nextInt(14)
        img4 = random.nextInt(14)
        img5 = random.nextInt(14)
        img6 = random.nextInt(14)
        img7 = random.nextInt(14)
        img8 = random.nextInt(14)
        img9 = random.nextInt(14)
        img10 = random.nextInt(14)
        img11 = random.nextInt(14)
        img12 = random.nextInt(14)
        img13 = random.nextInt(14)
        img14 = random.nextInt(14)
        img15 = random.nextInt(14)

        when(img1){
            1 -> imageView_icon1.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon1.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon1.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon1.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon1.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon1.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon1.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon1.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon1.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon1.setBackgroundResource(R.drawable.icon10)
        }

        when(img2){
            1 -> imageView_icon2.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon2.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon2.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon2.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon2.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon2.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon2.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon2.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon2.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon2.setBackgroundResource(R.drawable.icon10)
        }
        when(img3){
            1 -> imageView_icon3.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon3.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon3.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon3.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon3.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon3.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon3.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon3.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon3.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon3.setBackgroundResource(R.drawable.icon10)
        }
        when(img4){
            1 -> imageView_icon4.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon4.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon4.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon4.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon4.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon4.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon4.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon4.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon4.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon4.setBackgroundResource(R.drawable.icon10)
        }
        when(img5){
            1 -> imageView_icon5.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon5.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon5.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon5.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon5.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon5.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon5.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon5.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon5.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon5.setBackgroundResource(R.drawable.icon10)
        }
        when(img6){
            1 -> imageView_icon6.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon6.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon6.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon6.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon6.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon6.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon6.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon6.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon6.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon6.setBackgroundResource(R.drawable.icon10)
        }
        when(img7){
            1 -> imageView_icon7.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon7.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon7.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon7.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon7.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon7.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon7.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon7.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon7.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon7.setBackgroundResource(R.drawable.icon10)
        }
        when(img8){
            1 -> imageView_icon8.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon8.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon8.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon8.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon8.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon8.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon8.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon8.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon8.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon8.setBackgroundResource(R.drawable.icon10)
        }
        when(img9){
            1 -> imageView_icon9.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon9.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon9.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon9.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon9.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon9.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon9.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon9.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon9.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon9.setBackgroundResource(R.drawable.icon10)
        }
        when(img10){
            1 -> imageView_icon10.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon10.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon10.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon10.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon10.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon10.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon10.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon10.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon10.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon10.setBackgroundResource(R.drawable.icon10)
        }
        when(img11){
            1 -> imageView_icon11.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon11.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon11.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon11.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon11.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon11.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon11.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon11.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon11.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon11.setBackgroundResource(R.drawable.icon10)
        }
        when(img12){
            1 -> imageView_icon12.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon12.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon12.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon12.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon12.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon12.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon12.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon12.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon12.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon12.setBackgroundResource(R.drawable.icon10)
        }
        when(img13){
            1 -> imageView_icon13.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon13.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon13.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon13.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon13.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon13.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon13.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon13.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon13.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon13.setBackgroundResource(R.drawable.icon10)
        }
        when(img14){
            1 -> imageView_icon14.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon14.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon14.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon14.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon14.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon14.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon14.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon14.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon14.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon14.setBackgroundResource(R.drawable.icon10)
        }
        when(img15){
            1 -> imageView_icon15.setBackgroundResource(R.drawable.icon1)
            2 -> imageView_icon15.setBackgroundResource(R.drawable.icon2)
            3 -> imageView_icon15.setBackgroundResource(R.drawable.icon3)
            4 -> imageView_icon15.setBackgroundResource(R.drawable.icon4)
            5 -> imageView_icon15.setBackgroundResource(R.drawable.icon5)
            6 -> imageView_icon15.setBackgroundResource(R.drawable.icon6)
            7 -> imageView_icon15.setBackgroundResource(R.drawable.icon7)
            8 -> imageView_icon15.setBackgroundResource(R.drawable.icon8)
            9 -> imageView_icon15.setBackgroundResource(R.drawable.icon9)
            10 -> imageView_icon15.setBackgroundResource(R.drawable.icon10)
        }

    }


}