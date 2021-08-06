package com.rjhwork.mycompany.facadepattern.implement

import com.rjhwork.mycompany.facadepattern.Product
import com.rjhwork.mycompany.facadepattern.R

// 포테토칩
class Crisps : Product {
    override fun dispense(): Int = R.drawable.crisps
}