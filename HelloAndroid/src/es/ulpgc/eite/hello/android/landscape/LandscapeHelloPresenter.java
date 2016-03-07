package es.ulpgc.eite.hello.android.landscape;

import es.ulpgc.eite.hello.android.mediator.HelloMediatorCode;
import es.ulpgc.eite.hello.android.screen.hello.presenter.HelloPresenter;

/**
 * Created by Rubén on 07/03/2016.
 */
public class LandscapeHelloPresenter extends HelloPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
        changeRotation(HelloMediatorCode.PORTRAIT);
    }
}
