package com.prabhakaran.nytimesapp.features.presentation.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B5\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/prabhakaran/nytimesapp/features/presentation/main/MyItemRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/prabhakaran/nytimesapp/features/presentation/main/MyItemRecyclerViewAdapter$ViewHolder;", "clickListener", "Lkotlin/Function2;", "Lcom/prabhakaran/nytimesapp/common/data/model/m/Result;", "Landroid/widget/ImageView;", "", "context", "Landroid/content/Context;", "values", "", "(Lkotlin/jvm/functions/Function2;Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MyItemRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.prabhakaran.nytimesapp.features.presentation.main.MyItemRecyclerViewAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function2<com.prabhakaran.nytimesapp.common.data.model.m.Result, android.widget.ImageView, kotlin.Unit> clickListener = null;
    private final android.content.Context context = null;
    private final java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Result> values = null;
    
    public MyItemRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.prabhakaran.nytimesapp.common.data.model.m.Result, ? super android.widget.ImageView, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Result> values) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.prabhakaran.nytimesapp.features.presentation.main.MyItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.prabhakaran.nytimesapp.features.presentation.main.MyItemRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/prabhakaran/nytimesapp/features/presentation/main/MyItemRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/prabhakaran/nytimesapp/databinding/FragmentItemBinding;", "(Lcom/prabhakaran/nytimesapp/features/presentation/main/MyItemRecyclerViewAdapter;Lcom/prabhakaran/nytimesapp/databinding/FragmentItemBinding;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "parentView", "Landroidx/cardview/widget/CardView;", "getParentView", "()Landroidx/cardview/widget/CardView;", "publishedAt", "Landroid/widget/TextView;", "getPublishedAt", "()Landroid/widget/TextView;", "section", "getSection", "title", "getTitle", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView section = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView publishedAt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView parentView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.prabhakaran.nytimesapp.databinding.FragmentItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPublishedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getParentView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}