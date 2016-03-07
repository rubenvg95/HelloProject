package es.ulpgc.eite.hello.android.screen.counter.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObservable;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.hello.android.mediator.HelloMediatorCode;
import es.ulpgc.eite.hello.android.screen.counter.model.I_CounterModel;
import es.ulpgc.eite.hello.android.screen.counter.state.CounterState;
import es.ulpgc.eite.hello.android.screen.counter.view.I_CounterView;
import es.ulpgc.eite.hello.android.screen.hello.data.HelloData;
import es.ulpgc.eite.hello.android.screen.hello.model.I_HelloModel;
import es.ulpgc.eite.hello.android.screen.hello.state.HelloState;
import es.ulpgc.eite.hello.android.screen.hello.view.HelloView;

public class CounterPresenter extends AndroidScreenPresenter
        implements I_CounterPresenter, I_ScreenObservable {


    private Boolean _btnClicked;

    public Boolean getBtnClicked() {
        return _btnClicked;
    }

    public void setBtnClicked(Boolean btnClicked) {
        _btnClicked = btnClicked;
    }

    private I_CounterView getCounterView() {
        return (I_CounterView) getScreenView();
    }

    private I_CounterModel getCounterModel(){
        return (I_CounterModel) getScreenModel();
    }

    @Override
    public void buttonClicked(){
        setBtnClicked(true);
        debug("buttonClicked", "clicked", getBtnClicked());
        getCounterView().update(getCounterModel().incrementar());
        //getByeView().showMessage();
       // startNextScreenWithObserver((I_ScreenObserver) this, HelloMediatorCode.CLICK_COUNTER);
    }

    @Override
    public void createScreen() {
        debug("createScreen");
        getCounterView().setLayout();
        getCounterView().setListener();
        //getCounterView().hideMessage();
        setBtnClicked(false);

    }

    @Override
    public void backScreen() {

        debug("backScreen", "clicked", getBtnClicked());

        HelloState state = new HelloState();
        HelloData data;
        if(getBtnClicked()){
            data = new HelloData(I_CounterModel.TXT_MSG, I_HelloModel.TXT_BTN, I_HelloModel.TXT_BTNc);

        } else {
            data = new HelloData(I_HelloModel.TXT_MSG, I_HelloModel.TXT_BTN, I_HelloModel.TXT_BTNc);
        }
        state.setData(data);

        notifyScreenObservers(this, HelloMediatorCode.CLICK_BYE, state);
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen");

        //getByeView().setData(getByeModel().getData());
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
    }

    @Override
    public void setScreenState(
            Class<? extends I_ScreenView> view, int code, I_ScreenState state) {

        debug("setScreenState", "code", code);
        debug("setScreenState", "view", view.getSimpleName());

        if(state != null) {
            if (view.equals(HelloView.class) && code == HelloMediatorCode.CLICK_HELLO) {
                CounterState _state = (CounterState) state;
                getCounterModel().setData(_state.getData());
                setBtnClicked(_state.getBtnClicked());
            }
        }

        debug("setScreenState", "clicked", getBtnClicked());

    }

    @Override
    public I_ScreenState getScreenState() {

        CounterState state = new CounterState();
        state.setData(getCounterModel().getData());
        state.setBtnClicked(getBtnClicked());

        debug("getScreenState", "clicked", getBtnClicked());

        return state;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        return null;
    }


    @Override
    public void updateObservableState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {

    }
}
