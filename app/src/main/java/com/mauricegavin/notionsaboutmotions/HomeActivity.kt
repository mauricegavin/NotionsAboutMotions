package com.mauricegavin.notionsaboutmotions;

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_simple.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        addLabelListeners()
    }

    private fun addLabelListeners() {
        findViewById<TextView>(R.id.simple).setOnClickListener {
            val intent = Intent(this@HomeActivity, SimpleActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.simple_slower).setOnClickListener {
            val intent = Intent(this@HomeActivity, SimpleActivity::class.java)
            intent.putExtra("speed", 4000L)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.motion).setOnClickListener {
            val intent = Intent(this@HomeActivity, MotionActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.self_contained_motion).setOnClickListener {
            val intent = Intent(this@HomeActivity, SelfContainedMotionActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.custom_attributes).setOnClickListener {
            val intent = Intent(this@HomeActivity, CustomAttributesActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.image_filter).setOnClickListener {
            val intent = Intent(this@HomeActivity, ImageFilterActivity::class.java)
            intent.putExtra("mode",0)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.image_filter_2).setOnClickListener {
            val intent = Intent(this@HomeActivity, ImageFilterActivity::class.java)
            intent.putExtra("mode",1)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.keyframe).setOnClickListener {
            val intent = Intent(this@HomeActivity, KeyframeActivity::class.java)
            intent.putExtra("mode",0)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.keyframe2).setOnClickListener {
            val intent = Intent(this@HomeActivity, KeyframeActivity::class.java)
            intent.putExtra("mode",1)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.youtube).setOnClickListener {
            val intent = Intent(this@HomeActivity, YoutubeStyleActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.bonus).setOnClickListener {
            val intent = Intent(this@HomeActivity, StarWarsActivity::class.java)
            startActivity(intent)
        }

    }

}
