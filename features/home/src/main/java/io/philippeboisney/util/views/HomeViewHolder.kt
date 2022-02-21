package io.philippeboisney.util.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.util.HomeViewModel
import io.philippeboisney.util.databinding.ItemHomeBinding
import io.philippeboisney.model.User

class HomeViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    private val binding = ItemHomeBinding.bind(parent)

    fun bindTo(user: User, viewModel: HomeViewModel) {
        binding.user = user
        binding.viewmodel = viewModel
    }
}