package com.example.androidjetpack.architecture.navigation.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.androidjetpack.R
import kotlinx.android.synthetic.main.fragment_win.*

/**
 * A simple [Fragment] subclass.
 */
class WinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_win, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPlayAgain.setOnClickListener {
            findNavController().navigate(R.id.action_playAgain)
        }

        buttonSaveScore.setOnClickListener {
            val newName = editTextName.text.toString()

            // Send Name to Leader board
            val action = WinFragmentDirections.actionWinFragmentToLeaderBoardFragment()
            action.newName = newName
            findNavController().navigate(action)
        }
    }
}
