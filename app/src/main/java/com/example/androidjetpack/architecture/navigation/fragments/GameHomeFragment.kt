package com.example.androidjetpack.architecture.navigation.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.androidjetpack.R
import kotlinx.android.synthetic.main.fragment_game_home.*

class GameHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPlay.setOnClickListener { findNavController().navigate(R.id.action_gameHomeFragment_to_playingFragment) }
        buttonLeaderBoard.setOnClickListener { findNavController().navigate(R.id.action_gameHomeFragment_to_leaderBoardFragment, null) }
    }
}
