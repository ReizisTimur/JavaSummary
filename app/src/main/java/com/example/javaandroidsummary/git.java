package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class git extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git);
        //Меню Git
        AdapterView.OnItemClickListener gitListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:  //Настройка
                        Intent osnovaIntent = new Intent(git.this, git_config.class);
                        startActivity(osnovaIntent);break;
                    case 1:  //Создание репозитория и коммиты
                        Intent SozRepComIntent = new Intent(git.this, TextForm.class);
                        SozRepComIntent.putExtra("Page", "SRC");
                        startActivity(SozRepComIntent);break;
                }
            }
        };
        ListView gitMenu = (ListView) findViewById(R.id.gitLV);
        gitMenu.setOnItemClickListener(gitListener);
    }
}
