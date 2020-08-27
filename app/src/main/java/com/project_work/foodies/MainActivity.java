package com.project_work.foodies;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemAdapter.onItemSelected {
    TextView name_of_item,price_of_item;
    Button pay_btn;
    ElegantNumberButton quantity_of_item_selected;
    TextView total_amount;
    Spinner size_spinner,type_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pay_btn = findViewById(R.id.pay_btn);
        total_amount = findViewById(R.id.total_amount);
        size_spinner=findViewById(R.id.size_spinner);
        type_spinner=findViewById(R.id.type_spinner);
        price_of_item=findViewById(R.id.price_of_item);
        name_of_item=findViewById(R.id.name_of_item);
        quantity_of_item_selected=findViewById(R.id.quantity_of_item_selected);


        ArrayList<String> size=new ArrayList<String>();
        size.add("Small");
        size.add("Medium");
        size.add("Large");

        ArrayList<String> type=new ArrayList<String>();
        type.add("Baked");
        type.add("Roasted");

        ArrayAdapter<String> size_spinnerAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,size);
        size_spinner.setAdapter(size_spinnerAdapter);

        ArrayAdapter<String> type_spinnerAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,type);
        type_spinner.setAdapter(type_spinnerAdapter);

        size_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sizeText=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        type_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String typeText=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        quantity_of_item_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=quantity_of_item_selected.getNumber().toString();
                int price=Integer.parseInt(price_of_item.toString())*Integer.parseInt(num.toString());
                total_amount.setText(price);
            }
        });


        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        onItemClicked(0);
    }

    public void onItemClicked(int index)
    {
        name_of_item.setText(ApplicationClass.item.get(index).getItem_name());
        price_of_item.setText(ApplicationClass.item.get(index).getItem_price());
    }
}
