package com.pink.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pink.swoosh.Utilities.EXTRA_LEAGUE
import com.pink.swoosh.R
import com.pink.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skillLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)

    }

    fun onClickBaller (view: View)
    {
        begginerBtn.isChecked = false
        skillLevel = "zaawansowany"
    }

    fun onClickBeginner (view: View)
    {
        ballerBtn.isChecked = false
        skillLevel = "poczatkujacy"
    }
    fun onClickFinishClicked (view: View)
    {
        if (skillLevel != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skillLevel)
            startActivity(finishActivity)
        }
        else
        {
            Toast.makeText(this,"Please select a skill level,", Toast.LENGTH_SHORT).show()
        }

    }


}