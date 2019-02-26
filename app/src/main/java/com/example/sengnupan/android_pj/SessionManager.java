package com.example.sengnupan.android_pj;


import android.app.Activity;
import android.content.Intent;

import java.lang.reflect.Type;

import javax.security.auth.callback.Callback;

class SessionManager {

    static Activity activity;

    static SimpleFacebookConfiguration configuration;

    // private UiLifecycleHelper uiLifecycleHelper;

    private Callback mFacebookDialogCallback;

    public SessionManager(Activity activity, SimpleFacebookConfiguration mConfiguration) {

        SessionManager.activity = activity;

        SessionManager.configuration = configuration;
    }


    public boolean onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {

        //   uiLifecycleHelper.onActivityResult(requestCode, resultCode, data, mFacebookDialogCallback);

        return true;

    }

    public void login(OnLoginListener onLoginListener) {
    }


}
