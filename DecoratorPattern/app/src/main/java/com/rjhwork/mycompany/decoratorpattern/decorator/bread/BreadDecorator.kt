package com.rjhwork.mycompany.decoratorpattern.decorator.bread

import com.rjhwork.mycompany.decoratorpattern.model.bread.Bread

// 이 추상 클래스가 필요 없어 보일지도 모르지만.
// 사실은 이클래스가 Bread 를 상속 받음으로 써
// 이클래스를 상속받는 모든 decorator 들에게
// 장식을 할 수 있게 해준다.
abstract class BreadDecorator: Bread() {
    abstract fun description():String
    abstract fun kcal():Int
}