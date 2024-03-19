package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Contactlist[]= {
            "Stephen",
            "Nixel",
            "Brent",
            "Jan",
            "Jhon",
            "Kenric",
            "Kyll",
            "Prince",
            "Earl"
    };
    int avatar[]={
            R.drawable.isa,
            R.drawable.duha,
            R.drawable.tulo,
            R.drawable.upat,
            R.drawable.lima,
            R.drawable.unom,
            R.drawable.pito,
            R.drawable.walo,
            R.drawable.siyam
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView data_list=(ListView)findViewById(R.id.datalist);
        customAdapter base = new customAdapter(Contactlist, avatar, this);
        data_list.setAdapter(base);
    }
}