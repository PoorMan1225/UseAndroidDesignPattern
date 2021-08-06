package com.rjhwork.mycompany.criteriapattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rjhwork.mycompany.criteriapattern.filter.*
import com.rjhwork.mycompany.criteriapattern.model.Ingredient
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private val textView: TextView by lazy {
        findViewById(R.id.textView)
    }

    private val dataIngredientList = listOf<Ingredient>(
        Ingredient("Cheddar", "Locally produced", true),
        Ingredient("Ham", "Cheshire", false),
        Ingredient("Tomato", "Kent", true),
        Ingredient("Turkey", "Locally produced", false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val local = LocalFilter()
        printIngredient(local.meetCriteria(dataIngredientList), "Local")

        val nonLocal = NonLocalFilter()
        printIngredient(nonLocal.meetCriteria(dataIngredientList), "NonLocal")

        val vegetarianFilter = VegetarianFilter()
        printIngredient(vegetarianFilter.meetCriteria(dataIngredientList), "VegetarianFilter")

        val localAndVegetarianFilter = AndCriteria(local, vegetarianFilter)
        printIngredient(localAndVegetarianFilter.meetCriteria(dataIngredientList), "localAndVegetarianFilter")

        val localOrVegetarianFilter = OrCriteria(local, vegetarianFilter)
        printIngredient(localOrVegetarianFilter.meetCriteria(dataIngredientList), "localOrVegetarianFilter")
    }

    private fun printIngredient(ingredients: List<Ingredient>, header:String) {
        textView.append(header)

        ingredients.forEach { ingredient ->
            textView.append(StringBuilder()
                .append(ingredient.name)
                .append(" ")
                .append(ingredient.local)
                .append("\n")
                .toString())
        }
    }
}