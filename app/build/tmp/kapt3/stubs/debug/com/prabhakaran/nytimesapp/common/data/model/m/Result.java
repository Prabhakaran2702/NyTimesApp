package com.prabhakaran.nytimesapp.common.data.model.m;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\tH\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010M\u001a\u00020\rH\u00c6\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\u0083\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010T\u001a\u00020\rH\u00d6\u0001J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010 \u00a8\u0006V"}, d2 = {"Lcom/prabhakaran/nytimesapp/common/data/model/m/Result;", "Ljava/io/Serializable;", "abstract", "", "adx_keywords", "asset_id", "", "byline", "column", "", "des_facet", "", "eta_id", "", "geo_facet", "id", "media", "Lcom/prabhakaran/nytimesapp/common/data/model/m/Media;", "nytdsection", "org_facet", "per_facet", "published_date", "section", "source", "subsection", "title", "type", "updated", "uri", "url", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;Ljava/util/List;ILjava/util/List;JLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbstract", "()Ljava/lang/String;", "getAdx_keywords", "getAsset_id", "()J", "getByline", "getColumn", "()Ljava/lang/Object;", "getDes_facet", "()Ljava/util/List;", "getEta_id", "()I", "getGeo_facet", "getId", "getMedia", "getNytdsection", "getOrg_facet", "getPer_facet", "getPublished_date", "getSection", "getSource", "getSubsection", "getTitle", "getType", "getUpdated", "getUri", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Result implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String adx_keywords = null;
    private final long asset_id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object column = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> des_facet = null;
    private final int eta_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> geo_facet = null;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Media> media = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nytdsection = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> org_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> per_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String published_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String section = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subsection = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uri = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.prabhakaran.nytimesapp.common.data.model.m.Result copy(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String adx_keywords, long asset_id, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.Object column, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> des_facet, int eta_id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geo_facet, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Media> media, @org.jetbrains.annotations.NotNull()
    java.lang.String nytdsection, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.NotNull()
    java.lang.String published_date, @org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String adx_keywords, long asset_id, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.Object column, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> des_facet, int eta_id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geo_facet, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Media> media, @org.jetbrains.annotations.NotNull()
    java.lang.String nytdsection, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.NotNull()
    java.lang.String published_date, @org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdx_keywords() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getAsset_id() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getColumn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDes_facet() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getEta_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGeo_facet() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Media> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.prabhakaran.nytimesapp.common.data.model.m.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNytdsection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOrg_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPer_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublished_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubsection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
}