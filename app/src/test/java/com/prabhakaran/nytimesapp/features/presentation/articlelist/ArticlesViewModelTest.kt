package com.prabhakaran.nytimesapp.features.presentation.articlelist

import com.prabhakaran.memesapplication.feature.memes.business.ArticlesRepository
import com.prabhakaran.nytimesapp.features.presentation.main.ItemViewState
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import retrofit2.Response

class ArticlesViewModelTest(){

    private val postRepository = mockk<ArticlesRepository>()
    private lateinit var itemViewModel: ArticlesViewModel
    private val result =  NytNewsItem(
        "Copyright (c) 2022 The New York Times Company. All Rights Reserved.",
        "2022-07-15T06:06:41-04:00",
        33,
        emptyList(),
        "home",
        "OK"
    )

    @Before
    fun setUp(){
        itemViewModel = ArticlesViewModel(postRepository)
        coEvery {
            postRepository.getHome()
        } returns Response.success(result)

     @Test
     fun `test for home category`() = runTest {
            val states = mutableListOf<ItemViewState>()
            itemViewModel.postLiveData.observeForever(){ states.add(it) }
            itemViewModel.loadData(0)
             assert(states[0]== ItemViewState.Loading)
             assert(states[0]== ItemViewState.Content(result))
        }
    }

}