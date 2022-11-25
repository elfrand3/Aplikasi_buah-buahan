package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemFruitsBinding

class FruitsAdapter(private var c: Context, private val fruitsList:List<FruitsData>): RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>()
{

    inner class FruitsViewHolder(val v: ItemFruitsBinding): RecyclerView.ViewHolder(v.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemFruitsBinding>(infalter,R.layout.item_fruits,parent,false)
        return FruitsViewHolder(v)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        val fruitsLists = fruitsList[position]
        holder.v.isFruitsList = fruitsLists
        holder.v.fruitImg.setImageResource(fruitsLists.fruitsImg)
        holder.v.root.setOnClickListener {
            var imgF :Int= fruitsLists.fruitsImg
            var fruitsIntent = Intent(c,NewActivity::class.java)
            fruitsIntent.putExtra("fruitsName",fruitsLists.fruitsName)
            fruitsIntent.putExtra("fruitsInfo",fruitsLists.fruitsInfo)
            fruitsIntent.putExtra("fruitsStar",fruitsLists.fruitsStar)
            fruitsIntent.putExtra("fruitsImg",imgF)
            c.startActivity(fruitsIntent)


        }

    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}