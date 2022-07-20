package com.example.recycle_in_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_in_kotlin.R
import com.example.recycle_in_kotlin.model.UserModel

class UserAdapter:RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList= emptyList<UserModel>()
    class UserViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.user_item_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return userList.size
    }

}




