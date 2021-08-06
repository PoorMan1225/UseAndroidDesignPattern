package com.rjhwork.mycompany.bridgepattern

// 어떤 샌드위치를 만들 어 내야 하는지 담당 하는 클래스
// 실질적으로 구현하는 부분은 구현클래스에서 작성하게 된다.
class Sandwich(
    val filling1: String, val filling2:String,
    sandwichInterface: SandwichInterface) : AbstractSandwich(sandwichInterface) {

    override fun make() {
        sandwichInterface.makeSandwich(filling1, filling2)
    }
}