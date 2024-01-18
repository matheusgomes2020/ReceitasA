package com.matheus.receitasa.presentation.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.matheus.core.domain.model.Recipe
import com.matheus.receitasa.R
import com.matheus.receitasa.databinding.FragmentRecipesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RecipesFragment : Fragment() {

    private var _binding: FragmentRecipesBinding? = null
    private val binding: FragmentRecipesBinding get() = _binding!!

    private val viewModel: RecipesViewModel by viewModels()

    private val recipesAdapter = RecipesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRecipesBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecipesAdapter()

        lifecycleScope.launch {
            viewModel.recipesPagingData("brigadeiro").collect{ pagingData ->
                recipesAdapter.submitData(pagingData)
            }
        }
    }

    private fun initRecipesAdapter() {
        with(binding.recyclerRecipes) {
            setHasFixedSize(true)

        }
    }

}