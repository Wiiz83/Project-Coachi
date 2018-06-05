package com.Coachi.Coachi3D;

import com.unity3d.player.*;

import android.content.res.Configuration;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class UnityViewProvider {
    UnityPlayer mUnityPlayer;

    public UnityViewProvider(android.content.Context context) {
        mUnityPlayer = new UnityPlayer(context);
    }

    public View getView() {
        return mUnityPlayer.getView();
    }


    public void requestFocus() {
        mUnityPlayer.requestFocus();
    }

    protected void onDestroy() {
        mUnityPlayer.quit();
    }

    // Pause Unity
    protected void onPause() {
        mUnityPlayer.pause();
    }

    // Resume Unity
    protected void onResume() {
        mUnityPlayer.resume();
    }

    protected void onStart() {
        mUnityPlayer.start();
    }

    protected void onStop() {
        mUnityPlayer.stop();
    }

    // Low Memory Unity
    public void onLowMemory() {
        mUnityPlayer.lowMemory();
    }

    // Trim Memory Unity
    public void onTrimMemory() {
        mUnityPlayer.lowMemory();
    }

    // This ensures the layout will be correct.
    public void onConfigurationChanged(Configuration newConfig) {
        mUnityPlayer.configurationChanged(newConfig);
    }

    // Notify Unity of the focus change.
    public void onWindowFocusChanged(boolean hasFocus) {
        mUnityPlayer.windowFocusChanged(hasFocus);
    }

    // For some reason the multiple keyevent type is not supported by the ndk.
    // Force event injection by overriding dispatchKeyEvent().
    public boolean dispatchKeyEvent(KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    // Pass any events not handled by (unfocused) views straight to UnityPlayer
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    /*API12*/
    public boolean onGenericMotionEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

}
