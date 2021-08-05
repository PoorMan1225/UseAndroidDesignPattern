package com.rjhwork.mycompany.factorypattern.factory

import com.rjhwork.mycompany.factorypattern.Bread
import com.rjhwork.mycompany.factorypattern.ingredientBread.Baguette
import com.rjhwork.mycompany.factorypattern.ingredientBread.Brioche
import com.rjhwork.mycompany.factorypattern.ingredientBread.Roll

// 빵을 만들어 내는 공장.
class BreadFactory {

    fun getBread(breadType: String): Bread? {
        return when(breadType) {
            "BRI" -> Brioche()
            "BAG" -> Baguette()
            "ROL" -> Roll()
            else -> null
        }
    }
}