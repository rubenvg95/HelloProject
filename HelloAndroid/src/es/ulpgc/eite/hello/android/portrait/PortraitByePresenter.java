package es.ulpgc.eite.hello.android.portrait;

import es.ulpgc.eite.hello.android.mediator.HelloMediatorCode;
import es.ulpgc.eite.hello.android.screen.bye.presenter.ByePresenter;

/**
 * Created by Rubén on 08/03/2016.
 */
public class PortraitByePresenter extends ByePresenter{

    public void rotateScreen() {
        debug("rotateScreen");
        changeRotation(HelloMediatorCode.LANDSCAPE);
    }
}
