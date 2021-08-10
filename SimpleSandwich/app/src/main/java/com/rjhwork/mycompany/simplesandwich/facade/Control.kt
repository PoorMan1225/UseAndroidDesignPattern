package com.rjhwork.mycompany.simplesandwich.facade

import com.rjhwork.mycompany.simplesandwich.Sandwich
import com.rjhwork.mycompany.simplesandwich.SandwichBuilder
import com.rjhwork.mycompany.simplesandwich.databinding.ActivityMainBinding

interface Control {
    fun output(binding: ActivityMainBinding, sandwichBuilder: SandwichBuilder, sandwich: Sandwich):Sandwich
}