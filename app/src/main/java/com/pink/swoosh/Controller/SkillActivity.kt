package com.pink.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pink.swoosh.R
import com.pink.swoosh.Utilities.EXTRA_PLAYER
import com.pink.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

   lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

    }

    fun onClickBaller (view: View)
    {
        begginerBtn.isChecked = false
        player.skill = "zaawansowany"
    }

    fun onClickBeginner (view: View)
    {
        ballerBtn.isChecked = false
        player.skill = "poczatkujacy"
    }
    fun onClickFinishClicked (view: View)
    {
        if (player.skill != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else
        {
            Toast.makeText(this,"Please select a skill level,", Toast.LENGTH_SHORT).show()
        }

    }


}