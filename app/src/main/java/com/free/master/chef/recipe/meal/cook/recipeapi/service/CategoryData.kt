package com.free.master.chef.recipe.meal.cook.recipeapi.service

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class CategoryData(
    @SerializedName("idCategory")
    val idCategory: String? = null,
    @SerializedName("strCategory")
    val strCategory: String? = null,
    @SerializedName("strCategoryDescription")
    val strCategoryDescription: String? = null,
    @SerializedName("strCategoryThumb")
    val strCategoryThumb: String? = null
)

data class CategoryResponse(val categoryData: List<CategoryData>)
