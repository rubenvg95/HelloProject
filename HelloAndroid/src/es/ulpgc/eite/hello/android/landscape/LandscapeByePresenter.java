package es.ulpgc.eite.hello.android.landscape;

import es.ulpgc.eite.framework.core.mediator.MediatorCode;
import es.ulpgc.eite.hello.android.mediator.HelloMediatorCode;
import es.ulpgc.eite.hello.android.screen.bye.presenter.ByePresenter;

/**
 * Created by Rubén on 08/03/2016.
 */
public class LandscapeByePresenter extends ByePresenter{

    public void rotateScreen(){
        debug("rotateScreen");
        changeRotation(HelloMediatorCode.PORTRAIT);//Por que el código PORTRAIT? Pq es de la pantalla desde la que voy?
    }
}
