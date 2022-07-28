package com.prabhakaran.nytimesapp.common.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/prabhakaran/nytimesapp/common/data/di/NYModule;", "", "()V", "providesApiService", "Lcom/prabhakaran/nytimesapp/common/data/network/ApiService;", "providesPostRepository", "Lcom/prabhakaran/nytimesapp/features/business/ArticlesRepository;", "service", "app_debug"})
@dagger.Module()
public final class NYModule {
    
    public NYModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.prabhakaran.nytimesapp.common.data.network.ApiService providesApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.prabhakaran.nytimesapp.features.business.ArticlesRepository providesPostRepository(@org.jetbrains.annotations.NotNull()
    com.prabhakaran.nytimesapp.common.data.network.ApiService service) {
        return null;
    }
}