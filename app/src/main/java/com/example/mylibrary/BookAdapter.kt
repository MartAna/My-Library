package com.example.mylibrary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter (private val bookList: List<Book>) : RecyclerView.Adapter<BookViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val bookListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.book_list_item, parent, false)

        return BookViewHolder(bookListItemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.bind(book)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

}


