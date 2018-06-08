package com.Coachi.Coachi3D;

import com.unity3d.player.UnityPlayer;

public class ControlleurChien3D {
    private final String UNITY_COMPONENT = "DalmatianLP";


    /* Mouvements */
    public void goToCenter() {
        CallUnityMethod("goToCenter");
    }

    public void goToBed1() {
        CallUnityMethod("goToBed1");
    }

    public void goToBed2() {
        CallUnityMethod("goToBed2");
    }

    public void stopMovement() {
        CallUnityMethod("stopMovement");
    }

    /* etats */


    /* actions*/

    public void goToBowlAndEat() {
        CallUnityMethod("goToBowlAndEat");
    }

    private void CallUnityMethod(String methodName) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, "");
    }

    private void CallUnityMethod(String methodName, String arguments) {
        UnityPlayer.UnitySendMessage(UNITY_COMPONENT, methodName, arguments);
    }


}
