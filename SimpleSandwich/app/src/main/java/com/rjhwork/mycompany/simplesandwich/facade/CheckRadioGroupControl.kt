package com.rjhwork.mycompany.simplesandwich.facade

import com.rjhwork.mycompany.simplesandwich.Sandwich
import com.rjhwork.mycompany.simplesandwich.SandwichBuilder
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bagel
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bread
import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bun

class CheckRadioGroupControl : Control {
    override fun output(
        binding: ActivityMainBinding,
        sandwichBuilder: SandwichBuilder,
        sandwich: Sandwich
    ): Sandwich {
        val bread: Bread

        if (binding.radioBagel.isChecked) {
            bread = Bagel()
            sandwichBuilder.build(sandwich, bread)
        } else {
            bread = Bun()
            sandwichBuilder.build(sandwich, bread)
        }
        return sandwich
    }
}