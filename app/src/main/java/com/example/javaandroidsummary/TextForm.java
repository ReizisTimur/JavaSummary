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
            case "teoria":                   //пункт основного меню "Теория"
                setContentView(R.layout.teoria);break;
            case "primitiveTypes":          // пункт практика/примитивные типы
                setContentView(R.layout.activity_primitive_types);break;
            case "BOM":                     //Библиотечные объекты и методы
                setContentView(R.layout.activity_bibl_oject_meth);break;
            case "LEZ":                     //Литераторы и экспоненциальная запись
                setContentView(R.layout.activity_literatory);break;
            case "OPR":                     //Операторы
                setContentView(R.layout.activity_operators_layer);break;
            case "UK":                      //Управляющие конструкции
                setContentView(R.layout.uprav_konstrukcii);break;
            case "OEI":                     //Основные элементы интерфейса
                setContentView(R.layout.textview);break;
            case "LV":                      //ListView
                setContentView(R.layout.listview);break;
            case "Res":                     //Ресурсы
                setContentView(R.layout.resurses);break;
            case "PMA":                     //Передача данных между активностями
                setContentView(R.layout.perdanact);break;
            case "GO":                      //Основы настройки git
                setContentView(R.layout.gitosnova);break;
            case "TF":                      //Типы файлов и переносы строк
                setContentView(R.layout.typesfiles);break;
            case "GI":                      //.gitignore
                setContentView(R.layout.gitignore);break;
            case "SRC":                     //Создание репозитория и коммиты
                setContentView(R.layout.sozdrepcom);break;
            case "BV":                      //Базовые вещи
                setContentView(R.layout.bazovye_veschi);break;
            case "IAF":                     //Инициализация и завершение
                setContentView(R.layout.init_and_finish);break;
            case "PM":                      //Перегрузка методов
                setContentView(R.layout.peregruzka_meth);break;
            case "T":                       //This
                setContentView(R.layout.this_page);break;
            case "F":                       //Finalize()
                setContentView(R.layout.finalize_page);break;
        }
    }
}
