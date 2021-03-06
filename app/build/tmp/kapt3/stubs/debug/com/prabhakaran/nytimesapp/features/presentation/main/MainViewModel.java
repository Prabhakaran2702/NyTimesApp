package com.prabhakaran.nytimesapp.features.presentation.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/prabhakaran/nytimesapp/features/presentation/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/prabhakaran/nytimesapp/features/business/ArticlesRepository;", "(Lcom/prabhakaran/nytimesapp/features/business/ArticlesRepository;)V", "_postLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/prabhakaran/nytimesapp/features/presentation/main/ItemViewState;", "postLiveData", "Landroidx/lifecycle/LiveData;", "getPostLiveData", "()Landroidx/lifecycle/LiveData;", "loadData", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.prabhakaran.nytimesapp.features.business.ArticlesRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.prabhakaran.nytimesapp.features.presentation.main.ItemViewState> _postLiveData = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.prabhakaran.nytimesapp.features.business.ArticlesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.prabhakaran.nytimesapp.features.presentation.main.ItemViewState> getPostLiveData() {
        return null;
    }
    
    public final void loadData() {
    }
}