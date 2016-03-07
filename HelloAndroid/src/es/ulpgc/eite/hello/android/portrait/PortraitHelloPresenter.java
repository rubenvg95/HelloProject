package es.ulpgc.eite.hello.android.portrait;

import es.ulpgc.eite.framework.core.mediator.MediatorCode;
import es.ulpgc.eite.hello.android.mediator.HelloMediatorCode;
import es.ulpgc.eite.hello.android.screen.hello.presenter.HelloPresenter;

/**
 * Created by Rubén on 07/03/2016.
 */
public class PortraitHelloPresenter  extends HelloPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
        changeRotation(HelloMediatorCode.LANDSCAPE);
    }
}
