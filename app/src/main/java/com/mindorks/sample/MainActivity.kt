package com.mindorks.sample

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.mindorks.Flip
import com.mindorks.Quality
import com.mindorks.Screenshot
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable {
            image.setImageBitmap(
                Screenshot.with(this)
                    .setQuality(Quality.LOW)
                    .setFlip(Flip.NOTHING)
                    .getScreenshot()
            )
        }, 2000)

    }
}
