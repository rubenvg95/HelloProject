package es.ulpgc.eite.hello.android.screen.counter.state;

import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.hello.android.screen.counter.data.CounterData;

public class CounterState implements I_ScreenState {

    private CounterData _data;
    private Boolean _btnClicked;

    public CounterState() {
        setData(new CounterData());
        setBtnClicked(false);
    }

    public CounterData getData() {
        return _data;
    }

    public void setData(CounterData data) {
        _data = data;
    }

    public Boolean getBtnClicked() {
        return _btnClicked;
    }

    public void setBtnClicked(Boolean btnClicked) {
        _btnClicked = btnClicked;
    }
}
