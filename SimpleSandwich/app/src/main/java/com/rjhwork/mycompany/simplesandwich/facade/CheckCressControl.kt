package com.rjhwork.mycompany.simplesandwich.facade

import com.rjhwork.mycompany.simplesandwich.Sandwich
import com.rjhwork.mycompany.simplesandwich.SandwichBuilder
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding
import com.rjhwork.mycompany.simplesandwich.ingredient.filling.Cress

class CheckCressControl: Control {

    override fun output(
        binding: ActivityMainBinding,
        sandwichBuilder: SandwichBuilder,
        sandwich: Sandwich
    ): Sandwich {
        return if (binding.checkCress.isChecked) {
            sandwichBuilder.build(sandwich, Cress())
        } else {
            sandwich
        }
    }
}