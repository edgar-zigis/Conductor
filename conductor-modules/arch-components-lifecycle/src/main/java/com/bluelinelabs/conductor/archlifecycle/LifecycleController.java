package com.bluelinelabs.conductor.archlifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;

import com.bluelinelabs.conductor.Controller;

public abstract class LifecycleController extends Controller implements LifecycleOwner {

    private final ViewModelStore viewModelStore = new ViewModelStore();
    private final ControllerLifecycleOwner lifecycleOwner = new ControllerLifecycleOwner(this);

    public LifecycleController() {
        super();
    }

    public LifecycleController(@Nullable Bundle args) {
        super(args);
    }

    public ViewModelProvider viewModelProvider() {
        return viewModelProvider(new ViewModelProvider.AndroidViewModelFactory(getActivity().getApplication()));
    }

    public ViewModelProvider viewModelProvider(ViewModelProvider.NewInstanceFactory factory) {
        return new ViewModelProvider(viewModelStore, factory);
    }

    public ViewModelProvider viewModelProvider(ViewModelProvider.Factory factory) {
        return new ViewModelProvider(viewModelStore, factory);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModelStore.clear();
    }

    @Override @NonNull
    public Lifecycle getLifecycle() {
        return lifecycleOwner.getLifecycle();
    }

    public ControllerLifecycleOwner getLifecycleOwner() {
        return lifecycleOwner;
    }
}
