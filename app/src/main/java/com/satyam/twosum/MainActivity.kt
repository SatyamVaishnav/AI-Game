package com.satyam.twosum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlayer!!.setOnClickListener {
            val i = Intent(this, GameActivity::class.java)
            i.putExtra("cp", "Player");
            startActivity(i)
        }

        btnComputer!!.setOnClickListener {
            val i = Intent(this, GameActivity::class.java)
            i.putExtra("cp", "Computer");
            startActivity(i)
        }

    }
}