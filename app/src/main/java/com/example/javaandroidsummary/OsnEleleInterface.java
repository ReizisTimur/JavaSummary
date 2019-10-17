package com.example.javaandroidsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class OsnEleleInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osn_elele_interface);
        //Меню Основные элементы интерфейса
        AdapterView.OnItemClickListener OsnElemIntListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:  //TextView
                        Intent textviewIntent = new Intent(OsnEleleInterface.this, TextForm.class);
                        textviewIntent.putExtra("Page", "OEI");
                        startActivity(textviewIntent);break;
                }
            }
        };

        ListView OsnElIntListView = (ListView) findViewById(R.id.OsnElemLV);
        OsnElIntListView.setOnItemClickListener(OsnElemIntListener);
    }
}
