package es.ulpgc.eite.hello.android.screen.counter.view;


import es.ulpgc.eite.hello.android.screen.counter.data.CounterData;

public interface I_CounterView {

    void setLayout();
    void setData(CounterData data);
    void setListener();
    void update(int cantidad);
}
