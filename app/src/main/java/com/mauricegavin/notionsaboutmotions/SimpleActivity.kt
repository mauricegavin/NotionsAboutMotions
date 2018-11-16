package com.mauricegavin.notionsaboutmotions;

import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_simple.*


class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        val speed = intent.getLongExtra("speed", 600L)

        animation()
        toggleAnimation(speed)
    }

    private fun animation() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.activity_simple_end)
        TransitionManager.beginDelayedTransition(root)
        constraintSet.applyTo(root)
    }

    private fun toggleAnimation(speed: Long) {
        val constraintStart = ConstraintSet()
        constraintStart.clone(root)
        val constraintEnd = ConstraintSet()
        constraintEnd.clone(this, R.layout.activity_simple_end)

        var isEnd = false
        findViewById<ImageView>(R.id.emergency_image).setOnClickListener {

            val transition = AutoTransition()
            transition.duration = speed
            //transition.interpolator = android.view.animation.AccelerateDecelerateInterpolator()
            //transition.interpolator = android.view.animation.AnticipateOvershootInterpolator(1.0f)
            TransitionManager.beginDelayedTransition(root, transition)
            when (isEnd){
                true -> constraintStart
                false -> constraintEnd
            }.applyTo(root)
            isEnd = !isEnd
        }
    }

}
