package com.pink.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pink.swoosh.R
import com.pink.swoosh.Utilities.EXTRA_PLAYER
import com.pink.swoosh.model.Player

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchLeaguesText.text = "${player.league} ${player.skill}: wyszkukiwanie drużyny"
    }
}