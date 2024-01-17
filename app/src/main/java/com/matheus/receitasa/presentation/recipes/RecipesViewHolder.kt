package com.matheus.receitasa.presentation.recipes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.matheus.core.domain.model.Recipe
import com.matheus.receitasa.R
import com.matheus.receitasa.databinding.ItemRecipeBinding

class RecipesViewHolder(
    itemRecipeBinding: ItemRecipeBinding

) : RecyclerView.ViewHolder(itemRecipeBinding.root) {

    private val textLabel = itemRecipeBinding.textLabel
    private val imageRecipe = itemRecipeBinding.imageRecipe
    private val textTime = itemRecipeBinding.textTime
    private val textIngredientsQuantity = itemRecipeBinding.textIngredientsQuantity

    fun bind(recipe: Recipe) {
        textLabel.text = recipe.label
        textTime.text = recipe.time
        textIngredientsQuantity.text = recipe.ingredientsQuantity
        Glide.with(itemView)
            .load(recipe.imageUrl)
            .fallback(R.drawable.ic_img_loading_error)
            .into(imageRecipe)
    }

    companion object {
        fun create(parent: ViewGroup): RecipesViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemRecipeBinding.inflate(inflater, parent, false)
            return RecipesViewHolder(itemBinding)
        }
    }

}