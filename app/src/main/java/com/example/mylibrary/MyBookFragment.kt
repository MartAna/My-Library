package com.example.mylibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyBookFragment : Fragment() {

    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        floatingActionButton = view.findViewById(R.id.floating_action_button)



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_book, container, false)
    }
}

