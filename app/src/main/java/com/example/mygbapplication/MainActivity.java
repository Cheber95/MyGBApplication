package com.example.mygbapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_first);
        //setContentView(R.layout.activity_lesson1_second);

        Button button0 = findViewById(R.id.my_button);
        Button button1 = findViewById(R.id.my_button1);
        EditText editText0 = findViewById(R.id.my_edittext0);
        ToggleButton toggleButton0 = findViewById(R.id.my_toggle_button);
        TextView textView0 = findViewById(R.id.my_textview);
        CheckBox checkBox0 = findViewById(R.id.my_checkbox);
        Switch switch0 = findViewById(R.id.my_switch);
        LinearLayout linearLayoutFirst = findViewById(R.id.linear_layout_first);

        toggleButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((ToggleButton) v).isChecked();
                if (checked) {
                    toggleButton0.setBackgroundColor(Color.RED);
                    toggleButton0.setTextColor(Color.BLACK);
                } else {
                    toggleButton0.setBackgroundColor(Color.BLUE);
                    toggleButton0.setTextColor(Color.WHITE);
                }
            }
        });

        checkBox0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linearLayoutFirst.setBackgroundColor(Color.DKGRAY);
                } else {
                    linearLayoutFirst.setBackgroundColor(Color.WHITE);
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText0.getText().toString();
                textView0.setText(text);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onCreate(savedInstanceState);
                setContentView(R.layout.activity_lesson1_second);

                Button button2 = findViewById(R.id.my_button2);

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.activity_lesson1_first);
                    }
                });
            }
        });

        /*switch0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setContentView(R.layout.activity_lesson1_first);
                } else {
                    setContentView(R.layout.activity_lesson1_second);
                }
            }
        });*/
    }
}