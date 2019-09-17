package com.example.androidjetpack.architecture.databinding


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

import com.example.androidjetpack.R
import com.example.androidjetpack.databinding.FragmentLikeBinding

/**
 * A simple [Fragment] subclass.
 */
class LikeFragment : Fragment() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(LikeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_like, container, false)
        val binding: FragmentLikeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_like, container, false)
        setupDataBinding(binding)
        return binding.root
    }

    private fun setupDataBinding(binding: FragmentLikeBinding) {
        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        binding.viewmodel = viewModel
    }
}
