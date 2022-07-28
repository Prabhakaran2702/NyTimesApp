package com.prabhakaran.nytimesapp.features.business
import com.prabhakaran.nytimesapp.common.data.model.m.News
import com.prabhakaran.nytimesapp.common.data.network.ApiService
import retrofit2.Response
import javax.inject.Inject

class ArticlesRepositoryImp @Inject constructor(private val apiService: ApiService) :
    ArticlesRepository {

    override suspend fun getMostPopular(): Response<News> = apiService.getMostPopular()

}