package com.younbae.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.younbae.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener{
            Toast.makeText(this,"주사위 GO!",Toast.LENGTH_LONG).show()
            val x = Random.nextInt(1,6)
            val y = Random.nextInt(1,6)
            Log.d("MainActivity",x.toString())
            Log.d("MainActivity",y.toString())
            when (x) {
                1-> diceImage1.setImageResource(R.drawable.dice_1)
                2-> diceImage1.setImageResource(R.drawable.dice_2)
                3-> diceImage1.setImageResource(R.drawable.dice_3)
                4-> diceImage1.setImageResource(R.drawable.dice_4)
                5-> diceImage1.setImageResource(R.drawable.dice_5)
                6-> diceImage1.setImageResource(R.drawable.dice_6)
            }
            when (y) {
                1-> diceImage2.setImageResource(R.drawable.dice_1)
                2-> diceImage2.setImageResource(R.drawable.dice_2)
                3-> diceImage2.setImageResource(R.drawable.dice_3)
                4-> diceImage2.setImageResource(R.drawable.dice_4)
                5-> diceImage2.setImageResource(R.drawable.dice_5)
                6-> diceImage2.setImageResource(R.drawable.dice_6)
            }



        }
    }
}