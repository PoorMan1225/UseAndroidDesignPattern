package com.rjhwork.mycompany.decoratorpattern.model.bread

// 기본 빵1
class Bagel: Bread() {
    init {
        description = "Bagel"
        kcal = 250
    }
}