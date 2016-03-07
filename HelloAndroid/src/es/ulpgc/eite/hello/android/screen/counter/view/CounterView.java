package es.ulpgc.eite.hello.android.screen.counter.view;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.hello.android.R;
import es.ulpgc.eite.hello.android.screen.counter.data.CounterData;
import es.ulpgc.eite.hello.android.screen.counter.presenter.I_CounterPresenter;

public class CounterView extends AndroidScreenView implements I_CounterView {

    private I_CounterPresenter getCounterPresenter(){
        return (I_CounterPresenter) getScreenPresenter();
    }

    @Override
    public void setLayout(){
        debug("setLayout");
        setContentView(R.layout.counter_view);
    }


    @Override
    public void setData(CounterData data){
        debug("setData");

        TextView scrMsg = (TextView) findViewById(R.id.counterTextView);
        scrMsg.setText(data.getTxtMsg());

        Button scrBtn = (Button) findViewById(R.id.addButton);
        scrBtn.setText(data.getTxtBtn());
    }

    @Override
    public void setListener(){
        debug("setListener");

        Button scrBtn = (Button) findViewById(R.id.addButton);
        scrBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getCounterPresenter().buttonClicked();
            }
        });
    }

    @Override
    public void update(int cantidad) {
        TextView scrMsg = (TextView) findViewById(R.id.counterTextView);
        String valor = Integer.toString(cantidad);
        scrMsg.setText(valor);
    }
}
