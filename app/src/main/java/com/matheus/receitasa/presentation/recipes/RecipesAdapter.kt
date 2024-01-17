package com.matheus.receitasa.presentation.recipes

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.matheus.core.domain.model.Recipe

class RecipesAdapter : ListAdapter
<Recipe, RecipesViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesViewHolder {
        return RecipesViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecipesViewHolder, position: Int) {
        getItem( position )?.let {
            holder.bind( it )
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Recipe>() {
            override fun areItemsTheSame(
                oldItem: Recipe,
                newItem: Recipe
            ): Boolean {
                return oldItem.label == newItem.label
            }

            override fun areContentsTheSame(
                oldItem: Recipe,
                newItem: Recipe
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}