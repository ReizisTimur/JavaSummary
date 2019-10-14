package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        //принимаются значения ключа Page из активности с меню и выбирается соответствующий xml
        // с наполнением
        String Page = bundle.getString("Page");
        switch(Page){
            case "teoria":                                  //пункт основного меню "Теория"
                setContentView(R.layout.teoria);break;
            case "primitiveTypes":                          // пункт практика/примитивные типы
                setContentView(R.layout.activity_primitive_types);break;
            case "SCM":                                     //Синтаксис классов и методов
                setContentView(R.layout.activity_sint_class_method);break;
            case "BOM":                                     //Библиотечные объекты и методы
                setContentView(R.layout.activity_bibl_oject_meth);break;
            case "LEZ":                                     //Литераторы и экспоненциальная запись
                setContentView(R.layout.activity_literatory);break;
            case "OPR":                                       //Операторы
                setContentView(R.layout.activity_operators_layer);break;
            case "UK":                                       //Управляющие конструкции
                setContentView(R.layout.uprav_konstrukcii);break;


        }
    }
}
