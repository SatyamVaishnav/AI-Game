package com.satyam.twosum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var playerScore = 3
    var computerScore = 3
    var Player = ""
    var win = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btnAdd3!!.visibility = View.VISIBLE
        btnAdd4!!.visibility = View.VISIBLE

        Player = intent.getStringExtra("cp").toString()
        textCurrentPlayer.text= Player

        if (Player=="Computer"){
            computerTurn()
            textCurrentPlayer.text= "Player"
        }

            btnAdd3.setOnClickListener {

                if (!win){
                    if (Player=="Player"){
                        playerScore+=3
                        textPlayerScore.text = playerScore.toString()
                        checkWin()
                        computerTurn()
                    }
                }

            }

        btnAdd4.setOnClickListener {

            if (!win){
                if (Player=="Player"){
                    playerScore+=4
                    textPlayerScore.text = playerScore.toString()
                    checkWin()
                    computerTurn()
                }
            }

        }

    }

    fun computerTurn(){

        if (!win){
            var i = (3..4).random()
            computerScore+=i
            textComputerScore.text = computerScore.toString()
            Player = "Player"
        }
        checkWin()
    }

    fun checkWin():Boolean{
        win = !(playerScore<=22||computerScore<=22)
        if (win){
            textCurrentPlayer.text= Player+" Wins"
            btnAdd3!!.visibility = View.GONE
            btnAdd4!!.visibility = View.GONE
        }
        return win
    }



}