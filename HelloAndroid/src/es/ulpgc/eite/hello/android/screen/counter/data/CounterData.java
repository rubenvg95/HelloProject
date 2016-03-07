package es.ulpgc.eite.hello.android.screen.counter.data;


public class CounterData {

    private String _txtMsg;
    private String _txtBtn;
    private int _variable;

    public CounterData(String txtMsg, String txtBtn) {
        setTxtMsg(txtMsg);
        setTxtBtn(txtBtn);
    }
//
    public CounterData() {
        setTxtBtn("");
        setTxtMsg("");
        setVariable(0);
    }

    public String getTxtMsg() {
        return _txtMsg;
    }

    public void setTxtMsg(String txtMsg) {
        _txtMsg = txtMsg;
    }

    public int getVariable() {
        return _variable;
    }

    public void setVariable(int numero) {
        _variable = numero;
    }

    public String getTxtBtn() {
        return _txtBtn;
    }

    public void setTxtBtn(String txtBtn) {
        _txtBtn = txtBtn;
    }
}
