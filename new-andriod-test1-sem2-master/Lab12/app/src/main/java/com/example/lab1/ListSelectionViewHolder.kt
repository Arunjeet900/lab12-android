package com.example.lab1

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    val name = itemView.findViewById(R.id.Sname) as EditText
    val age = itemView.findViewById(R.id.Sage) as EditText
    val fees = itemView.findViewById(R.id.Sfees) as EditText
    val date = itemView.findViewById(R.id.Sdate) as EditText
}