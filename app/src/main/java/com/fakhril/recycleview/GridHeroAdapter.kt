package com.fakhril.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridHeroAdapter(val listHero : ArrayList<Hero>) : RecyclerView.Adapter<GridHeroAdapter.GridHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_hero, parent, false)
        return GridHolder(view)
    }

    override fun onBindViewHolder(holder: GridHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listHero[position].photo)
            .apply(RequestOptions ().override(55,55))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class GridHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}