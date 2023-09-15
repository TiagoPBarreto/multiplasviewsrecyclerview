package com.barreto.multiplasviewsrecyclerview


sealed class MainRecyclerViewItem{

    class Cabecalho(
        val image : Int
    ):MainRecyclerViewItem()

   class Ator(
       val nome : String,
       val papel : String,
       val image : Int
   ) : MainRecyclerViewItem()

}