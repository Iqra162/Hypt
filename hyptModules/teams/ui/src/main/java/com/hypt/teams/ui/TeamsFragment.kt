package com.hypt.teams.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hypt.teams.ui.databinding.FragmentTeamBinding


class TeamsFragment : Fragment() {
    lateinit var binding: FragmentTeamBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding =FragmentTeamBinding.bind(view)
    }

}