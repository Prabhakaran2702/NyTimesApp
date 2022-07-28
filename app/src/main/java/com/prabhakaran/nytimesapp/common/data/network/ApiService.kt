package com.prabhakaran.nytimesapp.common.data.network

import com.prabhakaran.nytimesapp.common.data.model.m.News
import com.prabhakaran.nytimesapp.common.utils.Constant.API_KEY
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {

    @GET("/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=${API_KEY}")
    suspend fun getMostPopular() : Response<News>

}