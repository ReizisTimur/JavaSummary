package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Activity_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        //Меню Activity
        AdapterView.OnItemClickListener activityListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i){
                case 0:    //Передача данных между активностями
                    Intent PeredAct = new Intent(Activity_activity.this, TextForm.class);
                    PeredAct.putExtra("Page", "PMA");
                    startActivity(PeredAct);
            }
            }
        };
        ListView activListview = (ListView) findViewById(R.id.activLV);
        activListview.setOnItemClickListener(activityListener);
    }
}
