package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;

public class OperatorsLayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators_layer);
        Bundle bundle = getIntent().getExtras();
        String opString = "";
        //В зависимости от значения полученной переменной MenuP выбирается значение opString,
        // которое выводится на экран
        int MenuOp = bundle.getInt("menuP");
        switch (MenuOp){
            case 0:
                opString = getResources().getString(R.string.operator1);break;
            case 1:
                opString = getResources().getString(R.string.operator2);break;
            case 2:
                opString = getResources().getString(R.string.operator3);break;
            case 3:
                opString = getResources().getString(R.string.operator4);break;
            case 4:
                opString = getResources().getString(R.string.operator5);break;
            case 5:
                opString = getResources().getString(R.string.operator6);break;
            case 6:
                opString = getResources().getString(R.string.operator7);break;
            case 7:
                opString = getResources().getString(R.string.operator8);break;
            case 8:
                opString = getResources().getString(R.string.operator9);break;


        }
        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView1 = new TextView(this);
        textView1.setText(opString);
        linearLayout.addView(textView1);
        setContentView(linearLayout);
    }

}
