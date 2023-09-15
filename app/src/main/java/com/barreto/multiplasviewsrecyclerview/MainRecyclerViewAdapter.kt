package com.barreto.multiplasviewsrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.barreto.multiplasviewsrecyclerview.databinding.ResActorBinding
import com.barreto.multiplasviewsrecyclerview.databinding.ResHeaderBinding

class MainRecyclerViewAdapter:RecyclerView.Adapter<MainRecyclerViewHolder>() {

    private var lista = mutableListOf<MainRecyclerViewItem>()

    fun setData (lista : MutableList<MainRecyclerViewItem>){
        this.lista = lista
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder =
        when(viewType){

            TIPO_ATOR -> MainRecyclerViewHolder.AtorViewHolder(
                ResActorBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            )
            TIPO_CABECALHO -> MainRecyclerViewHolder.AtorViewHolder(
                ResActorBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            )
            else -> throw IllegalArgumentException("Tipo Invalido")
        }



    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) =
        when(holder){
            is MainRecyclerViewHolder.AtorViewHolder -> holder.bind(lista[position] as MainRecyclerViewItem.Ator)
            is MainRecyclerViewHolder.CabecalhoViewHolder -> holder.bind(lista[position] as MainRecyclerViewItem.Cabecalho)
        }


    override fun getItemViewType(position: Int): Int = when(lista[position]){
            is MainRecyclerViewItem.Ator -> TIPO_ATOR
            is MainRecyclerViewItem.Cabecalho -> TIPO_CABECALHO
        }


    override fun getItemCount(): Int = lista.size

   companion object{
       const val TIPO_ATOR = 0
       const val TIPO_CABECALHO = 1
   }
}