package com.example.mylibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyBookFragment : Fragment() {

    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_my_book, container, false)
        floatingActionButton = view.findViewById(R.id.floating_action_button)
        val bookList: List<Book> = listOf(
            Book("Сказка о царе Салтане", "А.С. Пушкин"),
            Book("Герой нашего времени", "М.Ю. Лермонтов"),
            Book("Король Лир", "У. Шекспир")
        )
        val usersRecyclerView: RecyclerView = view.findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        usersRecyclerView.adapter = BookAdapter(bookList)

        return view
    }

}