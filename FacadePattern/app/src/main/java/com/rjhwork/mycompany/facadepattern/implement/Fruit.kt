package com.rjhwork.mycompany.facadepattern.implement

import com.rjhwork.mycompany.facadepattern.Product
import com.rjhwork.mycompany.facadepattern.R

class Fruit: Product{
    override fun dispense(): Int = R.drawable.fruit
}