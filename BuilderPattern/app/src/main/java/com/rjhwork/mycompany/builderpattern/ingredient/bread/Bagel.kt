package com.rjhwork.mycompany.builderpattern.ingredient.bread

class Bagel: Bread() {

    override fun name(): String = "Bagel"

    override fun calories(): Int = 250
}