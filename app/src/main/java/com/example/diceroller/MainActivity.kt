package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    class Dice(private val numSides: Int){

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice() }

        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val first_diceRoll = dice.roll()
        val second_diceRoll = dice.roll()
        val first_diceImage: ImageView = findViewById(R.id.imageView)
        val second_diceImage: ImageView = findViewById(R.id.imageView2)
        val firstDrawableResource = when(first_diceRoll){
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> (R.drawable.dice_4)
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }
        first_diceImage.setImageResource(firstDrawableResource)
        val secondDrawableResource = when(second_diceRoll){
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> (R.drawable.dice_4)
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }
        second_diceImage.setImageResource(secondDrawableResource)

        val sumOfDices: EditText = findViewById(R.id.editTextNumber)
        sumOfDices.setText((first_diceRoll + second_diceRoll).toString())



//        if (diceRoll == 1){
//            diceImage.setImageResource(R.drawable.dice_1)
//        }
//        else if (diceRoll == 2) {
//            diceImage.setImageResource(R.drawable.dice_2)
//        }
//        else if (diceRoll == 3) {
//            diceImage.setImageResource(R.drawable.dice_3)
//        }
//        else if (diceRoll == 4) {
//            diceImage.setImageResource(R.drawable.dice_4)
//        }
//        else if (diceRoll == 5) {
//            diceImage.setImageResource(R.drawable.dice_5)
//        }
//        else if (diceRoll == 6) {
//            diceImage.setImageResource(R.drawable.dice_6)
//        }
    }
}