package com.nitv.newsapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NewsApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NewsApp_GeneratedInjector {
  void injectNewsApp(NewsApp newsApp);
}
