package es.ulpgc.eite.hello.android.screen.counter.model;


import es.ulpgc.eite.hello.android.screen.counter.data.CounterData;

public interface I_CounterModel {

    String TXT_MSG = "Bye World!";
    String TXT_BTN = "Say Bye";

    CounterData getData();
    void setData(CounterData data);
    int incrementar();

}
