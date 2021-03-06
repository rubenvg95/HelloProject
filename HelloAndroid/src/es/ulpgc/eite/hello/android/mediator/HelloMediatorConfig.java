package es.ulpgc.eite.hello.android.mediator;


import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorConfig;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;
import es.ulpgc.eite.hello.android.landscape.LandscapeByePresenter;
import es.ulpgc.eite.hello.android.landscape.LandscapeByeView;
import es.ulpgc.eite.hello.android.landscape.LandscapeHelloPresenter;
import es.ulpgc.eite.hello.android.landscape.LandscapeHelloView;
import es.ulpgc.eite.hello.android.portrait.PortraitByePresenter;
import es.ulpgc.eite.hello.android.portrait.PortraitByeView;
import es.ulpgc.eite.hello.android.portrait.PortraitHelloPresenter;
import es.ulpgc.eite.hello.android.portrait.PortraitHelloView;
import es.ulpgc.eite.hello.android.screen.bye.model.ByeModel;
import es.ulpgc.eite.hello.android.screen.bye.presenter.ByePresenter;
import es.ulpgc.eite.hello.android.screen.bye.view.ByeView;
import es.ulpgc.eite.hello.android.screen.counter.model.CounterModel;
import es.ulpgc.eite.hello.android.screen.counter.presenter.CounterPresenter;
import es.ulpgc.eite.hello.android.screen.counter.view.CounterView;
import es.ulpgc.eite.hello.android.screen.hello.model.HelloModel;
import es.ulpgc.eite.hello.android.screen.hello.presenter.HelloPresenter;
import es.ulpgc.eite.hello.android.screen.hello.view.HelloView;

public class HelloMediatorConfig extends MediatorConfig{

    public HelloMediatorConfig(I_MediatorSingleton mediator) {
        super(mediator);
    }

    @Override
    public void setCustomConfig() {
        setHelloConfig();
    }

    private void setHelloConfig() {

        setHelloScreenCollection();
        setHelloTransitionCollection();
    }

    //Aqui tenemos que poner el conjunto de Vista, Presentador y Modelo de cada pantalla, si no se la pega.

    private void setHelloScreenCollection() {
        //getScreens().add(new MediatorScreen(HelloView.class, HelloPresenter.class, HelloModel.class));
        getScreens().add(new MediatorScreen(
                ByeView.class, ByePresenter.class, ByeModel.class));

        getScreens().add(new MediatorScreen(CounterView.class, CounterPresenter.class, CounterModel.class));

        getScreens().add(new MediatorScreen(
                LandscapeHelloView.class, LandscapeHelloPresenter.class, HelloModel.class));

        getScreens().add(new MediatorScreen(
                PortraitHelloView.class, PortraitHelloPresenter.class, HelloModel.class));

        getScreens().add(new MediatorScreen(
                LandscapeByeView.class, LandscapeByePresenter.class, ByeModel.class));

        getScreens().add(new MediatorScreen(
                PortraitByeView.class, PortraitByePresenter.class, ByeModel.class));
    }

    //Aqui tenemos que poner siempre la transición de la vista de donde partimos a la vista a donde vamos, con el código usado
    //y descrito en HelloMediatorCode


    private void setHelloTransitionCollection() {

        //getTransitions().add(new MediatorTransition(PortraitHelloView.class, ByeView.class, HelloMediatorCode.CLICK_HELLO));

        //getTransitions().add(new MediatorTransition(LandscapeHelloView.class, ByeView.class, HelloMediatorCode.CLICK_HELLO));

        // No puedes pasar de HellowView a las otras, sino de LandscapeHelloView o de PortraitHelloView a las otras. Creo que tiene que ver
        //con que la clase HelloView sea abstracta, no se pueden crear objetos de dicha clase. Preguntar! --> Sí, era por eso

        //getTransitions().add(new MediatorTransition(HelloView.class, CounterView.class, HelloMediatorCode.CLICK_COUNTER));

        getTransitions().add(new MediatorTransition(LandscapeHelloView.class, CounterView.class, HelloMediatorCode.CLICK_COUNTER));

        getTransitions().add(new MediatorTransition(PortraitHelloView.class, CounterView.class, HelloMediatorCode.CLICK_COUNTER));

        getTransitions().add(new MediatorTransition(LandscapeHelloView.class, PortraitHelloView.class, HelloMediatorCode.PORTRAIT));

        getTransitions().add(new MediatorTransition(PortraitHelloView.class, LandscapeHelloView.class, HelloMediatorCode.LANDSCAPE));


        ///////

        getTransitions().add(new MediatorTransition(PortraitHelloView.class, PortraitByeView.class, HelloMediatorCode.CLICK_HELLO));

        getTransitions().add(new MediatorTransition(LandscapeHelloView.class, LandscapeByeView.class, HelloMediatorCode.CLICK_HELLO));

        getTransitions().add(new MediatorTransition(PortraitByeView.class, LandscapeByeView.class, HelloMediatorCode.LANDSCAPE));

        getTransitions().add(new MediatorTransition(LandscapeByeView.class, PortraitByeView.class, HelloMediatorCode.PORTRAIT));
    }
}


