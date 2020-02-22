package com.mundanecode.textwatcherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText myEditText;
    //MyTextWatcher tWatcher;
    TextView myFruits;
    String[] fruits = {"Banana", "Apple", "Orange", "Guava", "Strawberry", "Mango", "Pineapple" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = findViewById(R.id.my_edittext);

        //tWatcher = new MyTextWatcher();
        myEditText.addTextChangedListener(this);

        myFruits = findViewById(R.id.my_fruits);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        String x = "";

        if (s.toString().length() == 0) {
            myFruits.setText(x);
            return;
        };



        for(int i = 0; i < fruits.length; i++){
            if (fruits[i].toUpperCase()
                    .contains(s.toString().toUpperCase())){
                x = x + fruits[i] + System.getProperty("line.separator");;
            }
        }

        myFruits.setText(x);
    }

    /*private class MyTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {

            String x = "";

            if (s.toString().length() == 0) {
                myFruits.setText(x);
                return;
            };



            for(int i = 0; i < fruits.length; i++){
                if (fruits[i].toUpperCase()
                        .contains(s.toString().toUpperCase())){
                    x = x + fruits[i] + System.getProperty("line.separator");;
                }
            }

            myFruits.setText(x);
        }
    }*/
}
