package com.rjhwork.mycompany.builderpattern

import com.rjhwork.mycompany.builderpattern.ingredient.bread.Bagel
import com.rjhwork.mycompany.builderpattern.ingredient.filling.CreamCheese
import com.rjhwork.mycompany.builderpattern.ingredient.filling.SmokedSalmon

class SandwichBuilder {

    companion object {

        // 재고 샌드위치
        fun readyMade(): Sandwich {
            val sandwich = Sandwich()

            return sandwich.apply {
                addIngredient(Bagel())
                addIngredient(SmokedSalmon())
                addIngredient(CreamCheese())
            }
        }

        // 고객 맞춤 샌드위치
        fun build(s:Sandwich, i:Ingredient):Sandwich {
            s.addIngredient(i)
            return s
        }
    }
}