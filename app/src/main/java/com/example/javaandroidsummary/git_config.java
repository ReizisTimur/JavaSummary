package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class git_config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_config);
        //Меню Git настройка
        AdapterView.OnItemClickListener gitConfListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:    //Основа
                        Intent osnovaGitIntent = new Intent(git_config.this, TextForm.class);
                        osnovaGitIntent.putExtra("Page", "GO");
                        startActivity(osnovaGitIntent);break;
                    case 1:   //Типы файлов и переносы строк
                        Intent typesFilesIntent = new Intent(git_config.this, TextForm.class);
                        typesFilesIntent.putExtra("Page", "TF");
                        startActivity(typesFilesIntent);break;
                    case 2:   //.gitignore
                        Intent gitignoreIntent = new Intent(git_config.this, TextForm.class);
                        gitignoreIntent.putExtra("Page", "GI");
                        startActivity(gitignoreIntent);break;
                }
            }
        };
        ListView gitConfMenu = (ListView) findViewById(R.id.gitConfigLV);
        gitConfMenu.setOnItemClickListener(gitConfListener);
    }
}
