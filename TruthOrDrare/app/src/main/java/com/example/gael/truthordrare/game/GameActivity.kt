package com.example.gael.truthordrare.game

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.gael.truthordrare.R

class GameActivity : AppCompatActivity() {

    companion object {

        fun newIntent(cxt :Context) : Intent {
            return Intent(cxt,GameActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
}
