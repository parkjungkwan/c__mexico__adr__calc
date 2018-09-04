package app.rstone.com.myapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num,res;
            String op;
            public void exe(){
                switch (op){
                    case "+":res+=num;break;
                    case "-":res-=num;break;
                    case "*":res*=num;break;
                    case "/":res/=num;break;
                }
            }
            public int getNum(){return num;}
            public void setNum(int num){this.num=num;}
            public String getOp(){return op;}
            public void setOp(String op){this.op=op;}
            public int getRes(){return res;}
            public void setRes(int res){this.res=res;}
        }
        final Calc c = new Calc();
        final EditText num = findViewById(R.id.num);
        findViewById(R.id.plus__btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                c.setNum(n);
                Log.d("입력값::",c.getNum()+"");
                Log.d("결과값 1::",c.getRes()+"");
                c.setOp("+");
                c.exe();
                Log.d("결과값 2::",c.getRes()+"");
                num.setText("");
            }
        });
        findViewById(R.id.equal__btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                Log.d("= before num::",c.getNum()+"");
                c.setNum(n);
                Log.d("op::",c.getOp());
                c.setOp(c.getOp());
                c.exe();
                num.setText("계산결과 : "+c.getRes());
            }
        });
        findViewById(R.id.ac__btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText("");
                c.setRes(0);
            }
        });

    }
}
