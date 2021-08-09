package com.rjhwork.mycompany.simplesandwich.ingredient

// 빵도 아니고 속재료도 아닌 부가 재료
// abstract 가 없다면 Salt 는 빵도 될 수 있고
// Filling 도 될 수 있을 것이다.
// 그러나 abstract 클래스를 추가하게 됨으로 써
// Salt 는 빵도 아니고 속재료도 아닌 부가재료가 될 수 있다.
class Salt: Ingredient {

    override val description: String = "Salt"

    override val kcal: Int = 0
}