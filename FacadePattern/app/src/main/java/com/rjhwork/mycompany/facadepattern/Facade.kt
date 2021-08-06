package com.rjhwork.mycompany.facadepattern

import com.rjhwork.mycompany.facadepattern.implement.Crisps
import com.rjhwork.mycompany.facadepattern.implement.Drink
import com.rjhwork.mycompany.facadepattern.implement.Fruit

// Facade 클래스에서 해당 구현 로직들을 한곳에 모아두는 장점이 있다.
class Facade() {
    val crisps: Crisps = Crisps()
    val drink: Drink = Drink()
    val fruit:Fruit = Fruit()
}