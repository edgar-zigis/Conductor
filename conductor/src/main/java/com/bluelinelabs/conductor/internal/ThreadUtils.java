package com.bluelinelabs.conductor.internal;

import android.os.Looper;
import android.util.AndroidRuntimeException;

public class ThreadUtils {

    public static void ensureMainThread() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new CalledFromWrongThreadException("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    private static final class CalledFromWrongThreadException extends AndroidRuntimeException {
        CalledFromWrongThreadException(String msg) {
            super(msg);
        }
    }
}