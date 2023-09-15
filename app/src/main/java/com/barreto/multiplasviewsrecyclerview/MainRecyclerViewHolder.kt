package com.barreto.multiplasviewsrecyclerview

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.barreto.multiplasviewsrecyclerview.databinding.ResActorBinding
import com.barreto.multiplasviewsrecyclerview.databinding.ResHeaderBinding

sealed class MainRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class CabecalhoViewHolder(
        private val binding : ResHeaderBinding
    ) :MainRecyclerViewHolder(binding){

        fun bind(cabecalho: MainRecyclerViewItem.Cabecalho){
            binding.imgHeader.setImageResource(cabecalho.image)
        }

    }

    class AtorViewHolder(
        private val binding: ResActorBinding
    ) : MainRecyclerViewHolder(binding){
        fun  bind(ator:MainRecyclerViewItem.Ator){

            binding.tvAtor.text = ator.nome
            binding.tvAtorPapel.text = ator.papel
            binding.imgAtor.setImageResource(ator.image)

        }
    }
}