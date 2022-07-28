package com.prabhakaran.nytimesapp.features.presentation.main

import com.prabhakaran.nytimesapp.common.data.model.m.News


sealed class ItemViewState{

    object Loading : ItemViewState()
    data class Content( val memes : News) : ItemViewState()
    data class Error( val error : String) : ItemViewState()

}
