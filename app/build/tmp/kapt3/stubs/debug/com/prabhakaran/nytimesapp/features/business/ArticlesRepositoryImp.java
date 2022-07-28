package com.prabhakaran.nytimesapp.features.business;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/prabhakaran/nytimesapp/features/business/ArticlesRepositoryImp;", "Lcom/prabhakaran/nytimesapp/features/business/ArticlesRepository;", "apiService", "Lcom/prabhakaran/nytimesapp/common/data/network/ApiService;", "(Lcom/prabhakaran/nytimesapp/common/data/network/ApiService;)V", "getMostPopular", "Lretrofit2/Response;", "Lcom/prabhakaran/nytimesapp/common/data/model/m/News;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ArticlesRepositoryImp implements com.prabhakaran.nytimesapp.features.business.ArticlesRepository {
    private final com.prabhakaran.nytimesapp.common.data.network.ApiService apiService = null;
    
    @javax.inject.Inject()
    public ArticlesRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.prabhakaran.nytimesapp.common.data.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMostPopular(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.prabhakaran.nytimesapp.common.data.model.m.News>> continuation) {
        return null;
    }
}