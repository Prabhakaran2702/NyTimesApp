package com.prabhakaran.nytimesapp.features.business

import com.prabhakaran.memesapplication.feature.memes.business.ArticlesRepositoryImp
import com.prabhakaran.nytimesapp.common.data.network.ApiService
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import retrofit2.Response

class ArticlesRepositoryImpTest (){

    private lateinit var postRepositoryImp: ArticlesRepositoryImp
    private val apiService = mockk<ApiService>()

    @Before
    fun setUp(){
        postRepositoryImp = ArticlesRepositoryImp((apiService))
    }

    @Test
    fun `get success results for home`() = runTest {

        coEvery {
            apiService.getHome()
        } returns Response.success( NytNewsItem(
            "Copyright (c) 2022 The New York Times Company. All Rights Reserved.",
            "2022-07-15T06:06:41-04:00",
            33,
            emptyList(),
            "home",
            "OK"
        ))
        val prod = postRepositoryImp.getHome()
        assert(prod.isSuccessful)
        assert(prod.body()?.status.equals("OK"))
        assert(prod.body()?.section.equals("home"))
        assert(prod.body()?.num_results!! >0)

    }

}