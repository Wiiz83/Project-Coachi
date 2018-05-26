package com.Coachi.Coachi3D;

import com.unity3d.player.UnityPlayer;

public class ControlleurChien3D {
    private final String UNITY_COMPONENT = "husky";


    /* Mouvements */
    public void goToCenter() {
        CallUnityMethod("goToCenter");
    }
    public void goToBed1 () {
        CallUnityMethod("goToBed1");
    }
    public void goToBed2() {
        CallUnityMethod("goToBed2");
    }
    public void stopMovement () {
        CallUnityMethod("stopMovement");
    }

    /* etats */
    public void anim_sit() {
        CallUnityMethod("anim_sit");
    }
    public void anim_stand () {
        CallUnityMethod("anim_stand");
    }
    public void anim_twoFeet  () {
        CallUnityMethod("anim_twoFeet");
    }

    /* actions*/
    public void anim_bark   () {
        CallUnityMethod("anim_bark");
    }
    public void anim_jump   () {
        CallUnityMethod("anim_jump");
    }


    private void CallUnityMethod(String methodName) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, "");
    }

    private void CallUnityMethod(String methodName, String arguments) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, arguments);
    }


}
