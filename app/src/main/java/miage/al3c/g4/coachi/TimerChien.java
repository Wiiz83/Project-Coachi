package miage.al3c.g4.coachi;

import android.os.CountDownTimer;

import com.Coachi.Coachi3D.ControlleurChien3D;

public class TimerChien extends CountDownTimer {
    private final ControlleurChien3D chien;

    private enum DEST {BED1,BED2,CENTER ;
        private static DEST[] vals = values();
        public DEST next()
        {
            return vals[(this.ordinal()+1) % vals.length];
        }
    }

    private DEST destiation  = DEST.BED1;

    public TimerChien(ControlleurChien3D chien) {
       super(9999999,15000);
       this.chien = chien;
   }


    @Override
    public void onTick(long millisUntilFinished) {
        destiation = destiation.next();
        switch ( destiation ) {
            case BED1: chien.goToBed1();break;
            case BED2: chien.goToBed2();break;
            case CENTER: chien.goToCenter();
            default: break;
        }
    }

    @Override
    public void onFinish() {
    }
}
