package app.rstone.com.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwitchCalc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_calc);
        Button plusBtn = findViewById(R.id.plus__btn);
        Button minusBtn = findViewById(R.id.minus__btn);
        Button multiBtn = findViewById(R.id.multi__btn);
        Button divisionBtn = findViewById(R.id.division__btn);
        Button equalBtn = findViewById(R.id.equal__btn);
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        multiBtn.setOnClickListener(this);
        divisionBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);
        switch (v.getId()){
            case R.id.plus__btn : break;
            case R.id.minus__btn : break;
            case R.id.multi__btn : break;
            case R.id.division__btn : break;
            case R.id.equal__btn : break;
        }
    }
}
