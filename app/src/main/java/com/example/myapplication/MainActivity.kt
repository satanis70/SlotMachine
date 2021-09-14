package com.example.myapplication

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.view.animation.DecelerateInterpolator

import android.view.animation.AlphaAnimation

import android.view.animation.Animation
import android.view.animation.AnimationSet

import android.view.animation.AccelerateInterpolator
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.collections.ArrayList
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {


    val arrayIcon = intArrayOf(R.drawable.icon1, R.drawable.icon2,
        R.drawable.icon3, R.drawable.icon4, R.drawable.icon5, R.drawable.icon6,
    R.drawable.icon7, R.drawable.icon8, R.drawable.icon9, R.drawable.icon10)

    val arrayIconList = ArrayList<Int>()
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        arrayIconList.addAll(arrayIcon.toList())
        imageView_spin.setOnClickListener {
            animate(imageView_icon1, arrayIconList, 0)
        }
    }

    fun animate(imageView1: ImageView, arrayImg: ArrayList<Int>, imageIndex: Int){
        val fadeInDuration = 500
        val timeBetween = 1000
        val fadeOutDuration = 50
        imageView1.setImageResource(arrayImg[imageIndex])

        val fadeIn: Animation = AlphaAnimation(0f, 1f)
        fadeIn.interpolator = DecelerateInterpolator()

        fadeIn.duration = fadeInDuration.toLong()

        val fadeOut: Animation = AlphaAnimation(1f, 0f)
        fadeOut.interpolator = AccelerateInterpolator()

        fadeOut.startOffset = (fadeInDuration + timeBetween).toLong()
        fadeOut.duration = fadeOutDuration.toLong()

        val animation = AnimationSet(false)

        animation.addAnimation(fadeIn)
        animation.addAnimation(fadeOut)
        animation.repeatCount = 1

        val animation2 = AnimationSet(false)

        animation2.addAnimation(fadeIn)
        animation2.addAnimation(fadeOut)
        animation2.repeatCount = 1

        val animation3 = AnimationSet(false)

        animation3.addAnimation(fadeIn)
        animation3.addAnimation(fadeOut)
        animation3.repeatCount = 1

        imageView1.animation = animation
        imageView_icon2.animation = animation2
        imageView_icon4.animation = animation3

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if(arrayImg.size-1 >imageIndex){
                    animate(imageView1, arrayImg, imageIndex+1)
                    imageView_icon2.setImageResource(arrayImg[imageIndex])
                    animation2.setAnimationListener(object : Animation.AnimationListener{
                        override fun onAnimationStart(animation: Animation?) {

                        }

                        override fun onAnimationEnd(animation: Animation?) {
                            imageView_icon4.setImageResource(arrayImg[imageIndex])
                        }

                        override fun onAnimationRepeat(animation: Animation?) {

                        }

                    })
                }

            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })


        /*CoroutineScope(Dispatchers.IO).launch {
            animation.setAnimationListener(object : Animation.AnimationListener{
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    if(arrayImg.size-1 >imageIndex){
                        animate(imageView1, arrayImg, imageIndex+1)
                        imageView_icon2.setImageResource(arrayImg[imageIndex])
                        animation2.setAnimationListener(object : Animation.AnimationListener{
                            override fun onAnimationStart(animation: Animation?) {

                            }

                            override fun onAnimationEnd(animation: Animation?) {
                                Toast.makeText(context, "gfg", Toast.LENGTH_LONG).show()
                                imageView_icon3.setImageResource(arrayImg[imageIndex])
                                animation3.setAnimationListener(object : Animation.AnimationListener{
                                    override fun onAnimationStart(animation: Animation?) {

                                    }

                                    override fun onAnimationEnd(animation: Animation?) {
                                    }

                                    override fun onAnimationRepeat(animation: Animation?) {

                                    }

                                })
                            }

                            override fun onAnimationRepeat(animation: Animation?) {

                            }

                        })
                    }

                }

                override fun onAnimationRepeat(animation: Animation?) {

                }

            })
        }*/




    }

}