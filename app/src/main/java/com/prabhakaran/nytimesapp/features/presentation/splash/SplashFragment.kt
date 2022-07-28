package com.prabhakaran.nytimesapp.features.presentation.splash

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.R.attr.data
import android.os.CountDownTimer
import androidx.navigation.Navigation
import com.prabhakaran.nytimesapp.databinding.FragmentSplashBinding



class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val timer = object: CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                Navigation.findNavController(binding.root).navigate( SplashFragmentDirections.actionSplashFragmentToMainFragment())

            }
        }
        timer.start()


    }


}