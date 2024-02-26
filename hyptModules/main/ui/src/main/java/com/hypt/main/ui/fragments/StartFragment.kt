package com.hypt.main.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hypt.main.ui.R
import com.hypt.main.ui.databinding.FragmentStartBinding
import com.navigation.NavigationFlow
import com.navigation.ToFlowNavigatable


class StartFragment : Fragment(R.layout.fragment_start) {
    lateinit var binding: FragmentStartBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStartBinding.bind(view)
        (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.HomeFlow)
//                (0..1).random().let {
//            when (it) {
//                0 -> (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.HomeFlow)
//                1 -> (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.ProfileFlow)
//            }
        //  }
    }
}