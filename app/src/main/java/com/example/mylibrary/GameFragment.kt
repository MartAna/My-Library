package com.example.mylibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class GameFragment : Fragment() {

    private lateinit var bookChoiceTextView: TextView
    private lateinit var buttonChoiceButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        bookChoiceTextView = view.findViewById(R.id.book_choice)
        buttonChoiceButton = view.findViewById(R.id.button_choice)

        return view
    }
}
