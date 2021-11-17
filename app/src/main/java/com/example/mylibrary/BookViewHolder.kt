package com.example.mylibrary

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(book: Book) {
        val titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
        val authorTextView: TextView = itemView.findViewById(R.id.author_text_view)

        titleTextView.text = book.title
        authorTextView.text = book.author
    }

}