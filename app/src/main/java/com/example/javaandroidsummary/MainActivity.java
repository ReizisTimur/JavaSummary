package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Главное меню. Содержит тектовое меню и его обработчик. Перенаправляет пользователя или на
        //вложенные меню, или на тектовую форму в зависимости от значения переменной Page

        AdapterView.OnItemClickListener hightMenuListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    //переход на тект Теория
                    case 0:
                        Intent teoriaIntent = new Intent(MainActivity.this, TextForm.class);
                        teoriaIntent.putExtra("Page", "teoria");
                        startActivity(teoriaIntent); break;
                    //переход на меню Практика
                    case 1:
                        Intent practicaIntent = new Intent(MainActivity.this, practica.class);
                        startActivity(practicaIntent);break;
                    //переход в меню Андроид
                    case 2:
                        Intent androidIntent = new Intent(MainActivity.this, Android.class);
                        startActivity(androidIntent);break;
                    case 3:  //Git
                        Intent gitIntent = new Intent (MainActivity.this, git.class);
                        startActivity(gitIntent);break;
                }
            }
        };
        //связываем меню и слушатель
        ListView teoriaListView = (ListView) findViewById(R.id.hightL);
        teoriaListView.setOnItemClickListener(hightMenuListener);
    }
}
