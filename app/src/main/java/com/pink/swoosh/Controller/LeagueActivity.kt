package com.pink.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pink.swoosh.R
import com.pink.swoosh.Utilities.EXTRA_PLAYER
import com.pink.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View)
    {
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

       player.league="mężczyźni"
    }

    fun onWomensClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "kobiety"
    }

    fun onCoedClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        player.league = "mężczyźni i kobiety"
    }

    fun leagueNextClicked(view: View)
    {
        if(player.league != "")
        {
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }
        else
        {
            Toast.makeText(this, "Proszę wybrać drużynę", Toast.LENGTH_SHORT).show()
        }

    }


}