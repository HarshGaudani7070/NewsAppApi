package com.example.newsappapi.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.newsappapi.Modal.ArticlesItem
import com.example.newsappapi.databinding.NewsViewBinding

class NewsAdapter(List: ArrayList<ArticlesItem>) : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    lateinit var context : Context
    var List = List

    class NewsHolder(itemView: NewsViewBinding) : ViewHolder(itemView.root){

        var binding = itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {

        context = parent.context
        var binding = NewsViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NewsHolder(binding)
    }

    override fun getItemCount(): Int {
        return  List.size

    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {

        Glide.with(context).load(List.get(position).urlToImage).into(holder.binding.imgNews)

        holder.binding.apply {

            List.get(position).apply {

                txtTitle.text = title.toString()
                txtDescription.text = description.toString()

            }

        }
    }

}