package com.weiyoung.eatwhatleh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class HomepageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val UBC_Randomizer = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.result)
        var foods: Array<String> = arrayOf(
            "My Home Cuisine", "Lanzhou Noodle", "Miyamae Sushi", "Donair Town", "Bubble Waffle Taiwanese", "Corner Kitchen",
            "Pita Pit", "Running Chicken", "Red Burrito", "Only U Cafe", "Subway", "McDonald's", "A&W", "Freshslice",
            "Nori", "Baodown", "Jamjar", "Uncle Fatih", "Tacomio", "Food @The Nest", "Bento Sushi", "Triple Os",
            "The Point", "Mercante", "Pacific Poke", "Chef Hung", "Freshii", "Virtous Pie", "Neptune Chinese"
        )


        UBC_Randomizer.setOnClickListener {
            val rand = Random().nextInt(foods.size)
            result.text = foods[rand]
        }


    }
}
