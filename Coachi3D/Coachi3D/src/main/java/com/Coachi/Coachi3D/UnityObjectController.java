package com.Coachi.Coachi3D;

import com.unity3d.player.UnityPlayer;

public abstract class UnityObjectController {
    private String UNITY_COMPONENT = "";

    UnityObjectController (String  GameObjectID ) {
        UNITY_COMPONENT = GameObjectID;
    }

    protected final void CallUnityMethod(String methodName) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, "");
    }

    protected final void CallUnityMethod(String methodName, String arguments) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, arguments);
    }
}
