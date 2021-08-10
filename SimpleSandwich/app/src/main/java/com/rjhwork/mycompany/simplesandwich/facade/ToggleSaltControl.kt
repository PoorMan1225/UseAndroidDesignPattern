package com.rjhwork.mycompany.simplesandwich.facade

import com.rjhwork.mycompany.simplesandwich.Sandwich
import com.rjhwork.mycompany.simplesandwich.SandwichBuilder
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding
import com.rjhwork.mycompany.simplesandwich.ingredient.Salt
import com.rjhwork.mycompany.simplesandwich.ingredient.filling.Cress

class ToggleSaltControl: Control {

    override fun output(
        binding: ActivityMainBinding,
        sandwichBuilder: SandwichBuilder,
        sandwich: Sandwich
    ): Sandwich {
        return if (binding.swichSalt.isChecked) {
            sandwichBuilder.build(sandwich, Salt())
        } else {
            sandwich
        }
    }
}