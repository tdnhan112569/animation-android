package com.dragon.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFadeIn.setOnClickListener {
           setAnimationForTextView(R.anim.fade_in)
        }
        btnFadeOut.setOnClickListener {
            setAnimationForTextView(R.anim.fade_out)
        }
        btnBlink.setOnClickListener {
            setAnimationForTextView(R.anim.blink)
        }
        btnMove.setOnClickListener {
            setAnimationForTextView(R.anim.move)
        }
        btnRotate.setOnClickListener {
            setAnimationForTextView(R.anim.rotate)
        }
        btnSequential.setOnClickListener {
            setAnimationForTextView(R.anim.sequential_animation)
        }
        btnSlideUp.setOnClickListener {
            setAnimationForTextView(R.anim.slide_up)
        }
        btnSlideDown.setOnClickListener {
            setAnimationForTextView(R.anim.slide_down)
        }
        btnZoomIn.setOnClickListener {
            setAnimationForTextView(R.anim.zoom_in)
        }
        btnZoomOut.setOnClickListener {
            setAnimationForTextView(R.anim.zoom_out)
        }
        btnTogether.setOnClickListener {
            setAnimationForTextView(R.anim.together)
        }
        //       val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down).apply {
            //            repeatCount = Animation.INFINITE
//            repeatMode = Animation.RESTART
//        }
//        val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up).apply {
//            repeatCount = Animation.INFINITE
//            repeatMode = Animation.RESTART
//        }
    }

    private fun setAnimationForTextView(id: Int) {
        textView.startAnimation(startAnimation(id))
    }

    private fun startAnimation(id : Int) : Animation{
        return AnimationUtils.loadAnimation(this, id).apply {
            repeatCount = Animation.INFINITE
            repeatMode = Animation.RESTART
        }
    }
}
