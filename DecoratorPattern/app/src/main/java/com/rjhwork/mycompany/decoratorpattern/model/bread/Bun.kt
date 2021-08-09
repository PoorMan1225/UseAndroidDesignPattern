package com.rjhwork.mycompany.decoratorpattern.model.bread

// 기본빵 2
class Bun: Bread() {
    init {
        description = "Bun"
        kcal = 150
    }
}