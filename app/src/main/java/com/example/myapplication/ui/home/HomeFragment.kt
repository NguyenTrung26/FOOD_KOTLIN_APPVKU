package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.HomeHorAdapter
import com.example.myapplication.models.HomeHorModel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val homeHorizontalRec: RecyclerView = root.findViewById(R.id.home_hor_rec)
        val homeHorModelList = listOf(
            HomeHorModel(R.drawable.pizza, "Pizza"),
            HomeHorModel(R.drawable.hamburger, "Hamburger"),
            HomeHorModel(R.drawable.fried_potatoes, "Fries"),
            HomeHorModel(R.drawable.ice_cream, "Ice Cream"),
            HomeHorModel(R.drawable.sandwich, "Sandwich")
        )
        val homeHorAdapter = HomeHorAdapter(requireActivity(), homeHorModelList)

        homeHorizontalRec.apply {
            adapter = homeHorAdapter
            layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
        }

        return root
    }

}