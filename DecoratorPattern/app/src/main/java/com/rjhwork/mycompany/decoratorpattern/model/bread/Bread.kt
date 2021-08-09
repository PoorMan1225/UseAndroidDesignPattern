package com.rjhwork.mycompany.decoratorpattern.model.bread

// 빵 클래스의 일부로 토스트와 오픈 샌드위치 속성을 포함할 수 있지만,
// 이것이 코드를 복잡하게 할 수 있다. 빵과 속재료가 재료 클래스를 상속하는데
// 는 동의한다. 이것은 둘 다 가격 및 칼로리 값과 같은 공통 속성을 갖고 있고,
// 같은 레이웃 구조로 표시되는 경우에만 해당한다.
// 그러나 샌드위치의 속을 채우는 경우에 토스트를 했는지와 스프레드 속성의 경우
// 에는 쓸모가 없어서 중복된다.
abstract class Bread {
    var description: String = ""
    var kcal: Int = 0
}