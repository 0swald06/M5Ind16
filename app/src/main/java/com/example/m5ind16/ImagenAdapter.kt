package com.example.m5ind6

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5ind16.R

class ImagenAdapter(val imagen: List<Imagen>) : RecyclerView.Adapter<ImagenAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var vista=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment,parent,false)
        return  ViewHolder(vista)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imagen[position])

    }

    override fun getItemCount(): Int {
        return imagen.size
    }
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        init {

        }

        fun bindItems(imagen: Imagen){



            itemView.setOnClickListener{
                var intent = Intent(itemView.context, VerImagen::class.java)

                intent.putExtra("pais",imagen.pais)
                intent.putExtra("poblacion",imagen.poblacion)

                itemView.context.startActivity(intent)

            }
            val nombre=itemView.findViewById<TextView>(R.id.item_nombre)
            nombre.text=imagen.pais


        }
    }
}