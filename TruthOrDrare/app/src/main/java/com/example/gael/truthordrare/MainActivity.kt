package com.example.gael.truthordrare

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.example.gael.truthordrare.game.GameActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myVideo : VideoView
    private val NAME_VIDEO : String = "splashscreen"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myVideo = video
    }

    override fun onStart() {
        super.onStart()

        val path : String = "android.resource://".plus(packageName).plus("/raw/").plus(NAME_VIDEO)
        myVideo.setVideoURI(Uri.parse(path))
        myVideo.start()
        myVideo.setOnCompletionListener { mp ->
            startActivity(GameActivity.newIntent(this))
        }
    }
}
