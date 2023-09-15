package com.barreto.multiplasviewsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.drawToBitmap
import androidx.recyclerview.widget.LinearLayoutManager
import com.barreto.multiplasviewsrecyclerview.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val mainRecyclerViewAdapter : MainRecyclerViewAdapter = MainRecyclerViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvMain.setHasFixedSize(true)
        binding.rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvMain.adapter = mainRecyclerViewAdapter

        mainRecyclerViewAdapter.setData(getData())
    }

    private fun getData(): MutableList<MainRecyclerViewItem> {

        val lista = mutableListOf<MainRecyclerViewItem>()

        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(MainRecyclerViewItem.Ator("Ewan McGewgor 1","Ben Kenob",R.drawable.img))
        lista.add(MainRecyclerViewItem.Ator("Ewan McGewgor 2","Ben Kenob",R.drawable.img))
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(MainRecyclerViewItem.Ator("Ewan McGewgor 3","Ben Kenob",R.drawable.img))
        lista.add(MainRecyclerViewItem.Ator("Ewan McGewgor 4","Ben Kenob",R.drawable.img))

        return lista
    }
}