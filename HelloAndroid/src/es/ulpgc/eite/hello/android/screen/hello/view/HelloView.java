package es.ulpgc.eite.hello.android.screen.hello.view;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.hello.android.R;
import es.ulpgc.eite.hello.android.screen.hello.data.HelloData;
import es.ulpgc.eite.hello.android.screen.hello.presenter.I_HelloPresenter;

public class HelloView extends AndroidScreenView implements I_HelloView {

    private I_HelloPresenter getHelloPresenter(){
        return (I_HelloPresenter) getScreenPresenter();
    }

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(R.layout.hello_view);
    }

    @Override
    public void hideMessage(){
        debug("hideMessage");

        TextView scrMsg = (TextView) findViewById(R.id.helloMsgTextView);
        scrMsg.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showMessage(){
        debug("showMessage");

        TextView scrMsg = (TextView) findViewById(R.id.helloMsgTextView);
        scrMsg.setVisibility(View.VISIBLE);
    }

    @Override
    public void setData(HelloData data){
        debug("setData");

        TextView scrMsg = (TextView) findViewById(R.id.helloMsgTextView);
        scrMsg.setText(data.getTxtMsg());

        Button scrBtn = (Button) findViewById(R.id.sayHelloButton);
        scrBtn.setText(data.getTxtBtn());

       Button scrBtn2 = (Button) findViewById(R.id.counterButton);
        scrBtn2.setText(data.geTtxtBtn2());
    }

    @Override
    public void setListener(){
        debug("setListener");

        Button scrBtn = (Button) findViewById(R.id.sayHelloButton);
        scrBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getHelloPresenter().buttonClicked();
            }
        });
        Button counterBtn = (Button) findViewById(R.id.counterButton);
        counterBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getHelloPresenter().buttonClickedCounter();
            }
        });
    }
}
