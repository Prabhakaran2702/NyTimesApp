package com.prabhakaran.nytimesapp.features.business

import com.prabhakaran.nytimesapp.common.data.model.m.News
import retrofit2.Response

interface ArticlesRepository {

    suspend fun getMostPopular() : Response<News>

}