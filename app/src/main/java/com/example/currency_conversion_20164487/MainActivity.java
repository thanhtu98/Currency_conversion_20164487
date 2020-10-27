package com.example.currency_conversion_20164487;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        items.add("USD"); //do la my
        items.add("VND"); // viet nam dong
        items.add("JPY"); // yen nhat
        items.add("EUR"); //euro
        items.add("GBP"); // bang anh
        items.add("RUB"); //rup nga
        items.add("AUD"); //do la uc
        items.add("SGD"); //do la singapore
        items.add("CZK"); //cron sec
        items.add("CHF"); //frank thuy sy
        items.add("NOK"); //krone na uy

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_spinner_dropdown_item,
//                items);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.layout_item,
                R.id.text_view,
                items);

        Spinner spinner1 = findViewById(R.id.fromSpinner);
        spinner1.setAdapter(adapter);

        spinner1.setSelection(0);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = items.get(i);
                Log.v("TAG", "Selected: " + item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner2 = findViewById(R.id.toSpinner);
        spinner2.setAdapter(adapter);
        spinner2.setSelection(1);
    }
}