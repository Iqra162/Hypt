package com.hypt.auth.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hypt.auth.ui.R
import com.hypt.main.ui.MainActivity
import com.hypt.auth.ui.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {
    lateinit var binding : FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.btnLogin.setOnClickListener {

            startActivity(Intent(requireActivity(),MainActivity::class.java))
            requireActivity().finishAffinity()
        }
    }

}