package com.prabhakaran.nytimesapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NyTimesApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NyTimesApp_GeneratedInjector {
  void injectNyTimesApp(NyTimesApp nyTimesApp);
}
