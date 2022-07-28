package com.prabhakaran.nytimesapp.features.presentation.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.prabhakaran.nytimesapp.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToMainFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_mainFragment);
  }
}
