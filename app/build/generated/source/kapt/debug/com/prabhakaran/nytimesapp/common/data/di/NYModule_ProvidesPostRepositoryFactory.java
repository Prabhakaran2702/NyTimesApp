// Generated by Dagger (https://dagger.dev).
package com.prabhakaran.nytimesapp.common.data.di;

import com.prabhakaran.nytimesapp.common.data.network.ApiService;
import com.prabhakaran.nytimesapp.features.business.ArticlesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NYModule_ProvidesPostRepositoryFactory implements Factory<ArticlesRepository> {
  private final NYModule module;

  private final Provider<ApiService> serviceProvider;

  public NYModule_ProvidesPostRepositoryFactory(NYModule module,
      Provider<ApiService> serviceProvider) {
    this.module = module;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ArticlesRepository get() {
    return providesPostRepository(module, serviceProvider.get());
  }

  public static NYModule_ProvidesPostRepositoryFactory create(NYModule module,
      Provider<ApiService> serviceProvider) {
    return new NYModule_ProvidesPostRepositoryFactory(module, serviceProvider);
  }

  public static ArticlesRepository providesPostRepository(NYModule instance, ApiService service) {
    return Preconditions.checkNotNullFromProvides(instance.providesPostRepository(service));
  }
}
