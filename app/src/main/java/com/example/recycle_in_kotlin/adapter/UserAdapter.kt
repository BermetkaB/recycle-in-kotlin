package com.example.recycle_in_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_in_kotlin.R
import com.example.recycle_in_kotlin.model.UserModel

class UserAdapter :RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    private var userList= emptyList<UserModel>()
    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.user_item_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemView.tv

    }

    override fun getItemCount(): Int {
     return userList.size   }


}

/*
val view=LayoutInflater.from(parent.context).inflate(R.layout.user_item_layout,parent,false)
return UserViewHolder(view)

private var userList= emptyList<UserModel>()
   */