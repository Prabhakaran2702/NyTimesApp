package com.prabhakaran.nytimesapp.features.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.prabhakaran.nytimesapp.common.utils.ObjectSerializer
import com.prabhakaran.nytimesapp.databinding.FragmentMainBinding
import com.prabhakaran.nytimesapp.features.presentation.articleview.ArticleViewActivity
import com.prabhakaran.nytimesapp.common.data.model.m.Result

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

     private lateinit var binding: FragmentMainBinding
     private val viewModel : MainViewModel by viewModels()


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
     ): View? {

            binding = FragmentMainBinding.inflate(layoutInflater)

            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            viewModel.loadData()
            observeLiveData()

        }


        private fun observeLiveData(){

            viewModel.postLiveData.observe(viewLifecycleOwner){

                when(it){
                    is ItemViewState.Loading -> { binding.progressBar.visibility = View.VISIBLE
                        binding.list.visibility = View.GONE
                    }
                    is ItemViewState.Content -> {

                        binding.progressBar.visibility = View.GONE
                        binding.list.visibility = View.VISIBLE

                        if (binding.list is RecyclerView) {
                            with(binding.list) {

                                layoutManager =  LinearLayoutManager(context)
                                adapter = MyItemRecyclerViewAdapter({ article: Result, imageView: ImageView ->
                                    navigateToArticle(article, imageView)
                                } ,context,it.memes.results)
                            }
                        } }

                    is ItemViewState.Error -> {}
                }

            }

        }


        private fun navigateToArticle(article: Result, imageView: ImageView) {
            val intent = Intent(requireContext(), ArticleViewActivity::class.java)
            intent.putExtra("article", ObjectSerializer.serialize(article))
            val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                imageView,
                "article_image"
            )
            intent.putExtra("fab_visiblity", View.VISIBLE)
            startActivity(intent, activityOptions.toBundle())
        }


    }