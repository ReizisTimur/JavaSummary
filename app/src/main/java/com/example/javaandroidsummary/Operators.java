package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Operators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
        //меню Практика
        //пункт меню передается в OperatorsLayer c помощью метода putExtra и переменной i
        AdapterView.OnItemClickListener operatorsListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent operatorIntent = new Intent(Operators.this, OperatorsLayer.class);
                operatorIntent.putExtra("menuP", i);
                startActivity(operatorIntent);
            }
        };
        ListView operatorsListView = (ListView) findViewById(R.id.operatorsLV);
        operatorsListView.setOnItemClickListener(operatorsListener);
    }
}
