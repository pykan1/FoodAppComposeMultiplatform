package com.example.foodapp.root.screens.foodByCategory

import com.example.foodapp.root.domain.models.FoodUI

data class FoodByCategoryState(
    val foods: List<FoodUI>,
    val category: String
) {
    companion object {
        val InitState = FoodByCategoryState(
            foods = emptyList(),
            category = ""
        )
    }
}