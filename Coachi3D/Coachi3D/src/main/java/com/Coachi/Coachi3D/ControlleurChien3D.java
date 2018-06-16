package com.Coachi.Coachi3D;


public class ControlleurChien3D  extends  UnityObjectController{

    public ControlleurChien3D () {
        super("DalmatianLP");
   }


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


    /* actions*/

    public void goToBowlAndEat() {
        CallUnityMethod("goToBowlAndEat");
    }
    public void goToCenterAndPlay() {
        CallUnityMethod("goToCenterAndPlay");
    }

}
