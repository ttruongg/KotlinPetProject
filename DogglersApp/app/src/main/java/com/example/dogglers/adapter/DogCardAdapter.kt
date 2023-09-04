/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource

    val list = DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
        val imgDog = view?.findViewById<ImageView>(R.id.imgDogger)
        val txtName = view?.findViewById<TextView>(R.id.nameDogger)
        val txtAge = view?.findViewById<TextView>(R.id.txtAge)
        val txtHobbies = view?.findViewById<TextView>(R.id.hobbies)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        when (layout){
            1,2 -> {
                val adapter = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent,false)
                return DogCardViewHolder(adapter)
            }

            3 -> {
                val adapter = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
                return DogCardViewHolder(adapter)
            }
        }
        return DogCardViewHolder(null)
    }

    override fun getItemCount(): Int {
        return list.size
    } // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        // TODO: Set the image resource for the current dog
        // TODO: Set the text for the current dog's name
        // TODO: Set the text for the current dog's age
        val dog = list[position]
        if (dog == null){
            return
        }
        holder.imgDog?.setImageResource(dog.imageResourceId)
        holder.txtName?.setText(dog.name)
        holder.txtAge?.setText(dog.age)
        holder.txtHobbies?.setText(dog.hobbies)

        val resources = context?.resources
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}
