package com.hypt.main.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hypt.main.ui.R
import com.hypt.main.ui.databinding.FragmentStartBinding


class StartFragment : Fragment(R.layout.fragment_start) {
    lateinit var binding : FragmentStartBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStartBinding.bind(view)
    }
}