package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class practica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica);
        //создаем слушатель для страницы Практика и или передаем переменную Page в текстовую форму,
        //или открываем вложенной меню
        AdapterView.OnItemClickListener practicaListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:  // Примитивные типы
                        Intent PrimTypeIntent = new Intent(practica.this, TextForm.class);
                        PrimTypeIntent.putExtra("Page", "primitiveTypes");
                        startActivity(PrimTypeIntent);break;
                    case 1:  //Синтаксис класов и методов
                        Intent ClassMethIntent = new Intent(practica.this, TextForm.class);
                        ClassMethIntent.putExtra("Page", "SCM");
                        startActivity(ClassMethIntent);break;
                    case 2:  //Библиотечные объекты и методы
                        Intent BiblObjMethIntent = new Intent(practica.this, TextForm.class);
                        BiblObjMethIntent.putExtra("Page", "BOM");
                        startActivity(BiblObjMethIntent);break;
                    case 3:   //Литераторы и экспоненциальная запись
                        Intent LiteratIntent = new Intent(practica.this, TextForm.class);
                        LiteratIntent.putExtra("Page", "LEZ");
                        startActivity(LiteratIntent);break;
                    case 4:   //Операторы
                        Intent OperatorsIntent = new Intent(practica.this, Operators.class);
                        startActivity(OperatorsIntent);
                    case 5:  //Управляющие конструкции
                        Intent UprKonsIntent = new Intent (practica.this, TextForm.class);
                        UprKonsIntent.putExtra("Page", "UK");
                        startActivity(UprKonsIntent);
                }

            }
        };
        ListView practListview = (ListView) findViewById(R.id.practicaListView);
        practListview.setOnItemClickListener(practicaListener);
    }
}
