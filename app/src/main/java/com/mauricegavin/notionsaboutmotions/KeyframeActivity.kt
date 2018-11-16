package com.mauricegavin.notionsaboutmotions;

import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_simple.*


class KeyframeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        when (intent.getIntExtra("mode", 0)) {
           0 -> setContentView(R.layout.activity_keyframe)
           1 -> setContentView(R.layout.activity_keyframe_2)
        }

    }

}
