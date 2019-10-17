package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SintClassMeth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sint_class_meth);
        //Меню Синтаксис классов и методов
        AdapterView.OnItemClickListener SintClMethListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:  //базовые вещи
                        Intent BazVe = new Intent(SintClassMeth.this, TextForm.class);
                        BazVe.putExtra("Page", "BV");
                        startActivity(BazVe);break;
                    case 1:   //Инициализация и завершение
                        Intent initAndFinIntent = new Intent(SintClassMeth.this, TextForm.class);
                        initAndFinIntent.putExtra("Page", "IAF");
                        startActivity(initAndFinIntent);break;
                    case 2:   //Перегрузка методов
                        Intent PeregruzMethIntent = new Intent(SintClassMeth.this, TextForm.class);
                        PeregruzMethIntent.putExtra("Page", "PM");
                        startActivity(PeregruzMethIntent);break;
                    case 3:   //This
                        Intent thisIntent = new Intent(SintClassMeth.this, TextForm.class);
                        thisIntent.putExtra("Page", "T");
                        startActivity(thisIntent);break;
                    case 4:   //Finalize()
                        Intent finalizeIntent = new Intent(SintClassMeth.this, TextForm.class);
                        finalizeIntent.putExtra("Page", "F");
                        startActivity(finalizeIntent);break;
                }
            }
        };
        ListView SntClMeth = (ListView) findViewById(R.id.SintClassMethAR);
        SntClMeth.setOnItemClickListener(SintClMethListener);
    }
}
