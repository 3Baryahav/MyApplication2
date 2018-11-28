package com.example.bar_y.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Targilel2 extends AppCompatActivity {
    Random rnd=new Random();
    int i;
    int d;
    Button btn4;
    Button btn3;
    Button btn2;
    Button btn1;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targilel2);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        txt1=(TextView) findViewById(R.id.txt1);
        txt2=(TextView) findViewById(R.id.txt2);
        txt3=(TextView) findViewById(R.id.txt3);
    }

    public void rndNUM(View view) {
        i=rnd.nextInt(75);
        d=rnd.nextInt(75);
        txt2.setText(""+i);
        txt3.setText(""+d);
    }

    public void SHAVE(View view) {
        if (i==d)
            txt1.setText("yos");
        else
            txt1.setText("not");
    }

    public void katan(View view) {
        if (i<d)
            txt1.setText("yos");
        else
            txt1.setText("not");

    }

    public void Gadol(View view) {
        if (i>d)
            txt1.setText("YOS");
        else
            txt1.setText("not");
    }
}
