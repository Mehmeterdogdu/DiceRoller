package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDice : Button = findViewById(R.id.zarbt)
        btnDice.setOnClickListener()
        {
            rollDice()
        }

    }

    fun rollDice(){
        val image: ImageView = findViewById(R.id.zarimage)
        val textview : TextView = findViewById(R.id.zartw)
        val dice = Dice(6)
        val rolledDice = dice.roll()

        var turnedImage = when(rolledDice)
        {
            1 -> R.drawable.zar1
            2 -> R.drawable.zar2
            3 -> R.drawable.zar3
            4 -> R.drawable.zar4
            5 -> R.drawable.zar5
            else -> R.drawable.zar6
        }
        image.setImageResource(turnedImage)
        textview.setText("Atılan zar =" + rolledDice.toString())


    }
}

class Dice(val numside: Int)
{


    fun roll() : Int{
       return (1..numside).random()
    }


}