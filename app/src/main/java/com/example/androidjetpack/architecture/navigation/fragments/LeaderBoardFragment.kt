package com.example.androidjetpack.architecture.navigation.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.androidjetpack.R
import kotlinx.android.synthetic.main.fragment_leader_board.*

/**
 * A simple [Fragment] subclass.
 */
class LeaderBoardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leader_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Receive Name
        arguments?.let {
            val safeArgs = LeaderBoardFragmentArgs.fromBundle(it)
            val newName = safeArgs.newName
            textViewName.text = newName
        }

        buttonBack.setOnClickListener { findNavController().popBackStack() }
    }
}
