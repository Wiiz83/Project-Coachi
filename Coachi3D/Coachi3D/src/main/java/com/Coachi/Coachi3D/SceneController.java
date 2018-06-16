package com.Coachi.Coachi3D;

public class SceneController extends UnityObjectController {
    public SceneController() {
        super("Controller");
    }

    public void ShowAnimal(boolean b) {
        if (!b)
            CallUnityMethod("hideAnimal");
        else
            CallUnityMethod("showAnimal");
    }

    public void ShowBowl(boolean b) {
        if (!b)
            CallUnityMethod("hideBowl");
        else
            CallUnityMethod("showBowl");
    }
}
