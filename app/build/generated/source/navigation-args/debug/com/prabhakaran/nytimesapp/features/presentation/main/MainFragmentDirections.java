package com.prabhakaran.nytimesapp.features.presentation.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.prabhakaran.nytimesapp.R;

public class MainFragmentDirections {
  private MainFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMainFragmentToSplashFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_splashFragment);
  }
}
