package com.example.itemtochhelper.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itemtochhelper.R
import com.example.itemtochhelper.model.user

class UserAdapter(
    private val context: Context,
    private val data: List<user>
) : RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder>() {

    class UserAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName: TextView = itemView.findViewById(R.id.user_name)
        val txtDOB: TextView = itemView.findViewById(R.id.user_dob)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapterViewHolder {
        val adapterLayout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserAdapterViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: UserAdapterViewHolder, position: Int) {
        val user = data[position]
        if (user == null) {
            return
        }
        holder.txtName.setText(user.Name)
        holder.txtDOB.setText(user.DOB)
    }
}