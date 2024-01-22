package com.matheus.receitasa.presentation.recipes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.matheus.receitasa.databinding.ItemRecipeLoadMoreStateBinding

class RecipesLoadMoreStateViewHolder(
    itemBinding: ItemRecipeLoadMoreStateBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(itemBinding.root){

    private val binding = ItemRecipeLoadMoreStateBinding.bind(itemView)
    private val progressBarLoadingMore = binding.progressLoadingMore
    private val textTryAgainMessage = binding.textTryAgain.also {
        it.setOnClickListener{
            retry()
        }
    }

    fun bind(loadSate: LoadState) {
        progressBarLoadingMore.isVisible = loadSate is LoadState.Loading
        textTryAgainMessage.isVisible = loadSate is LoadState.Error
    }

    companion object {
        fun create(parent: ViewGroup, retry: () -> Unit): RecipesLoadMoreStateViewHolder {
            val itemBinding = ItemRecipeLoadMoreStateBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)

            return RecipesLoadMoreStateViewHolder(itemBinding, retry)
        }
    }
}