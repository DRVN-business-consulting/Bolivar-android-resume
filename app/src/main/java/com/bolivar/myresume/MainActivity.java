package com.bolivar.myresume;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        CheckBox checkBox = findViewById(R.id.checkBox);
        TextView College = findViewById(R.id.College);
        TextView School = findViewById(R.id.School);

        checkBox.setOnCheckedChangeListener((CheckBox, isChecked)-> {

        if (isChecked) {
                College.setVisibility(View.VISIBLE);
                School.setVisibility(View.VISIBLE);
            } else {
                College.setVisibility(View.GONE);
                School.setVisibility(View.GONE);
            }
        });


        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        TextView PSA = findViewById(R.id.PSA);
        TextView ISA = findViewById(R.id.ISA);

        checkBox2.setOnCheckedChangeListener((CheckBox, isChecked)-> {

            if (isChecked) {
                PSA.setVisibility(View.VISIBLE);
                ISA.setVisibility(View.VISIBLE);
            } else {
                PSA.setVisibility(View.GONE);
                ISA.setVisibility(View.GONE);
            }
        });

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        TextView skills1 = findViewById(R.id.skills1);
        TextView skills2 = findViewById(R.id.skills2);
        TextView skills3 = findViewById(R.id.skills3);
        TextView skills4 = findViewById(R.id.skills4);
        SeekBar seekBar = findViewById(R.id.seekBar);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        SeekBar seekBar4 = findViewById(R.id.seekBar4);



        checkBox3.setOnCheckedChangeListener((CheckBox, isChecked)-> {

            if (isChecked) {
                skills1.setVisibility(View.VISIBLE);
                skills2.setVisibility(View.VISIBLE);
                skills3.setVisibility(View.VISIBLE);
                skills4.setVisibility(View.VISIBLE);
                seekBar.setVisibility(View.VISIBLE);
                seekBar2.setVisibility(View.VISIBLE);
                seekBar3.setVisibility(View.VISIBLE);
                seekBar4.setVisibility(View.VISIBLE);
            } else {
                skills1.setVisibility(View.GONE);
                skills2.setVisibility(View.GONE);
                skills3.setVisibility(View.GONE);
                skills4.setVisibility(View.GONE);
                seekBar.setVisibility(View.GONE);
                seekBar2.setVisibility(View.GONE);
                seekBar3.setVisibility(View.GONE);
                seekBar4.setVisibility(View.GONE);
            }
        });


        seekBar.setEnabled(false);
        seekBar2.setEnabled(false);
        seekBar3.setEnabled(false);
        seekBar4.setEnabled(false);
    }
}




