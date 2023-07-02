package com.example.m5ind6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import com.example.m5ind16.databinding.ItemFragmentBinding


class VerImagen: AppCompatActivity(){
private lateinit var  mBinding: ItemFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ItemFragmentBinding.inflate(layoutInflater)
        setContentView(mBinding.root)



        val nombre=intent.getStringExtra("pais")
        val descripcion=intent.getStringExtra("poblacion")


        mBinding.itemNombre.setText(nombre)




    }
}