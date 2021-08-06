package com.rjhwork.mycompany.bridgepattern

// 어떤 sandwich 가 만들어져야 하는지 나타내는 클래스
// make 함수를 추상화 시킴으로 써 구현해야 할 부분을 명확히 했다.
abstract class AbstractSandwich(
    val sandwichInterface: SandwichInterface) {

    abstract fun make()
}