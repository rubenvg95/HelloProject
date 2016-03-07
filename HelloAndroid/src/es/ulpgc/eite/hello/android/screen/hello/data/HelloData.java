package es.ulpgc.eite.hello.android.screen.hello.data;


public class HelloData {

    private String _txtMsg;
    private String _txtBtn;
    private String _txtBtn2;

    public HelloData(String txtMsg, String txtBtn, String txtBtn2) {
        setTxtMsg(txtMsg);
        setTxtBtn(txtBtn);
        setTxtBtn2(txtBtn2);
    }

    public HelloData() {
        setTxtBtn("");
        setTxtMsg("");
        setTxtBtn2("");
    }

    public String getTxtMsg() {
        return _txtMsg;
    }

    public void setTxtMsg(String txtMsg) {
        _txtMsg = txtMsg;
    }

    public String getTxtBtn() {
        return _txtBtn;
    }

    public void setTxtBtn(String txtBtn) {
        _txtBtn = txtBtn;
    }

    public String geTtxtBtn2() {
        return _txtBtn2;
    }


    public void setTxtBtn2(String txtBtn2) {
        _txtBtn2 = txtBtn2;
    }

}
