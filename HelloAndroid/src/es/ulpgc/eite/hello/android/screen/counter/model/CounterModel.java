package es.ulpgc.eite.hello.android.screen.counter.model;


import es.ulpgc.eite.framework.android.AndroidScreenModel;
import es.ulpgc.eite.hello.android.screen.counter.data.CounterData;
import es.ulpgc.eite.hello.android.screen.counter.presenter.I_CounterPresenter;

public class CounterModel extends AndroidScreenModel implements I_CounterModel {



    private CounterData _data;

    public CounterModel() {
        setData(new CounterData());
    }

    @Override
    public CounterData getData() {
       return _data;
    }

    @Override
    public void setData(CounterData data) {
        _data = data;
    }

    CounterData obj = new CounterData();

    int x=0;

    @Override
    public int incrementar() {

        //int variable = obj.getVariable();
        x++;
        //obj.setVariable(x);
        debug("incrementamos");
        return x;
    }

    private I_CounterPresenter getCounterPresenter(){
        return (I_CounterPresenter) getScreenPresenter();
    }

}
