package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class adapters_and_lists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapters_and_lists);
        //Адаптеры и списки
        AdapterView.OnItemClickListener AdapAndListListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:  //ListView
                        Intent ListviewIntent = new Intent(adapters_and_lists.this, TextForm.class);
                        ListviewIntent.putExtra("Page", "LV");
                        startActivity(ListviewIntent);
                }

            }
        };
        ListView AdapAndListListView = (ListView) findViewById(R.id.adapAndLiLV);
        AdapAndListListView.setOnItemClickListener(AdapAndListListener);
    }
}
