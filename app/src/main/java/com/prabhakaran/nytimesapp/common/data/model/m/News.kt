package com.prabhakaran.nytimesapp.common.data.model.m

data class News(
    val copyright: String,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)