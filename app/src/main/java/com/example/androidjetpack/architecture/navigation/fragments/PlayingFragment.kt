package com.example.androidjetpack.architecture.navigation.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

import com.example.androidjetpack.R
import kotlinx.android.synthetic.main.fragment_playing.*

/**
 * A simple [Fragment] subclass.
 */
class PlayingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_playing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Animation In, Out
        val options = navOptions {
            anim {
                enter = R.anim.fade_slide_out_top
                exit = R.anim.fade_slide_in_top
                popEnter = R.anim.fade_slide_out_top
                popExit = R.anim.fade_slide_in_top
            }
        }

        buttonYes.setOnClickListener { findNavController().navigate(R.id.action_playingFragment_to_winFragment, null, options) }
        buttonNo.setOnClickListener { findNavController().navigate(R.id.action_playingFragment_to_loseFragment, null, options) }
    }
}
