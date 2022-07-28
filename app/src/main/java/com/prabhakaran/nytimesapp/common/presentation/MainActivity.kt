package com.prabhakaran.nytimesapp.common.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prabhakaran.nytimesapp.R
import com.prabhakaran.nytimesapp.features.presentation.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}