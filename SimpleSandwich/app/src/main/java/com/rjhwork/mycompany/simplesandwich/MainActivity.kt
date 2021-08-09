package com.rjhwork.mycompany.simplesandwich

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding
import com.rjhwork.mycompany.simplesandwich.decorator.Toasted
import com.rjhwork.mycompany.simplesandwich.ingredient.Salt
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bagel
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bread
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bun
import com.rjhwork.mycompany.simplesandwich.ingredient.filling.Cress
import com.rjhwork.mycompany.simplesandwich.ingredient.filling.Egg

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var builder: SandwichBuilder
    private lateinit var sandwich: Sandwich
    private lateinit var toasted: Toasted
    private lateinit var bread: Bread

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onActionOnClicked(view: View) {
        builder = SandwichBuilder()
        sandwich = Sandwich()
        var toast: String = ""
        var extraKcal = 0

        if (binding.radioBagel.isChecked) {
            bread = Bagel()
            sandwich = builder.build(sandwich, bread)
        } else {
            bread = Bun()
            builder.build(sandwich, bread)
        }

        if (binding.checkEgg.isChecked) {
            sandwich = builder.build(sandwich, Egg())
        }

        if (binding.checkCress.isChecked) {
            sandwich = builder.build(sandwich, Cress())
        }

        if (binding.swichSalt.isChecked) {
            sandwich = builder.build(sandwich, Salt())
        }

        if (binding.swichToasted.isChecked) {
            val t = Toasted(bread)
            toast = t.decoration
            extraKcal += t.decorationKcal
        }else {
            toast = " "
        }

        binding.orderTextView.text =
            StringBuilder()
                .append(toast)
                .append(" ")
                .append(sandwich.getSandwich())
                .append("\n")
                .append(sandwich.getKcal())
                .append(" kcal")
                .toString()
    }
}