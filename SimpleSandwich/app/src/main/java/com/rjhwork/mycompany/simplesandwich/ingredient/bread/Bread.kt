package com.rjhwork.mycompany.simplesandwich.ingredient.bread

import com.rjhwork.mycompany.simplesandwich.ingredient.Ingredient

// 이 추상클래스가 필요 없어 보일 수 있다.
// 그러나 이 추상클래스가 있음으로 써
// 빵도 아니고, 속재료도 아닌 부가 재료를
// 추가할 수 있게 된다.
abstract class Bread: Ingredient {
    open val decoration:String = ""
    open val decorationKcal: Int = 0
}