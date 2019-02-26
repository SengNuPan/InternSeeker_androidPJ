package com.example.sengnupan.android_pj;


import java.util.ArrayList;

import java.util.List;



import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;



public class SimpleFacebook {
    boolean login;
    private static SimpleFacebook mInstance = null;

    //  private static SimpleFacebookConfiguration mConfiguration = new SimpleFacebookConfiguration.Builder().build();



    private static Activity mActivity;

    private static SessionManager mSessionManager = null;

    private SimpleFacebook() {

    }


    public boolean isLogin() {
        return login;
    }

    public void invite(String string, OnInviteListener onInviteListener, Object o) {
    }

    public static SimpleFacebook getInstance(Activity activity) {

        if (mInstance == null) {

            mInstance = new SimpleFacebook();

            //    mSessionManager = new SessionManager(activity, mConfiguration);

        }

        mActivity = activity;

        SessionManager.activity = activity;

        return mInstance;

    }
    public boolean onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {

        return mSessionManager.onActivityResult(activity, requestCode, resultCode, data);

    }



    /**

     * Clean all references like Activity to prevent memory leaks

     */

    public void clean() {

        mActivity = null;

        SessionManager.activity = null;

    }

    public void login(OnLoginListener onLoginListener) {

        mSessionManager.login(onLoginListener);

    }


    public static void setConfiguration(SimpleFacebookConfiguration configuration) {
    }
}

