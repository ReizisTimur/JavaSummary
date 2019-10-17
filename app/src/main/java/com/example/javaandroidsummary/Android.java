package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Android extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        //Меню Андроид
        AdapterView.OnItemClickListener AndroidListenerMenu = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    //переход в Основные элементы интерфейса
                    case 0:
                        Intent OsnElInter = new Intent(Android.this, OsnEleleInterface.class);
                        startActivity(OsnElInter);break;
                    //переход в Адаптеры и списки
                    case 1:
                        Intent AdapAndListIntent = new Intent(Android.this, adapters_and_lists.class);
                        startActivity(AdapAndListIntent);break;
                    case 2: //Ресурсы
                        Intent ResursIntent = new Intent(Android.this, TextForm.class);
                        ResursIntent.putExtra("Page", "Res");
                        startActivity(ResursIntent);break;
                    case 3:  //Активности
                        Intent ActivityIntent = new Intent(Android.this, Activity_activity.class);
                        startActivity(ActivityIntent);break;
                }


            }
        };

        ListView androidListView = (ListView) findViewById(R.id.androidMenu);
        androidListView.setOnItemClickListener(AndroidListenerMenu);
    }
}
