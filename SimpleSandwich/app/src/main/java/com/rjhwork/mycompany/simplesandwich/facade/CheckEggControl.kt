package com.rjhwork.mycompany.simplesandwich.facade

import com.rjhwork.mycompany.simplesandwich.Sandwich
import com.rjhwork.mycompany.simplesandwich.SandwichBuilder
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding
import com.rjhwork.mycompany.simplesandwich.ingredient.filling.Egg

class CheckEggControl : Control {

    override fun output(
        binding: ActivityMainBinding,
        sandwichBuilder: SandwichBuilder,
        sandwich: Sandwich
    ): Sandwich {
        return if (binding.checkEgg.isChecked) {
            sandwichBuilder.build(sandwich, Egg())
        } else {
            sandwich
        }
    }
}