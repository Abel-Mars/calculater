package com.example.calculaterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class DanweiActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_normal_1:
                Intent intent =new Intent(DanweiActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danwei);
        final EditText text_mi = (EditText)findViewById(R.id.text_mi);
        final EditText text_chi = (EditText)findViewById(R.id.text_chi);
        final EditText text_zhang = (EditText)findViewById(R.id.text_zhang);
        Button button_mi = (Button)findViewById(R.id.button_mi);
        Button button_chi = (Button)findViewById(R.id.button_chi);
        Button button_zhang = (Button)findViewById(R.id.button_zhang);
        button_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text_mi.getText().toString().equals("")) {
                    double value = Double.valueOf(text_mi.getText().toString());
                    text_chi.setText(String.valueOf(value * 3.2808399));
                    text_zhang.setText(String.valueOf(value * 0.30003));
                }
            }
        });
        button_chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text_chi.getText().toString().equals("")) {
                    double value = Double.valueOf(text_chi.getText().toString());
                    text_mi.setText(String.valueOf(value / 3.2808399));
                    text_zhang.setText(String.valueOf(value / 3.2808399 * 0.30003));
                }
            }
        });
        button_zhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text_zhang.getText().toString().equals("")) {
                    double value = Double.valueOf(text_zhang.getText().toString());
                    text_mi.setText(String.valueOf(value / 0.30003));
                    text_chi.setText(String.valueOf(value * 3.2808399 / 0.30003));
                }
            }
        });
        final EditText text_kg = (EditText)findViewById(R.id.text_kg);
        final EditText text_bang = (EditText)findViewById(R.id.text_bang);
        final EditText text_dan = (EditText)findViewById(R.id.text_dan);
        Button button_kg = (Button)findViewById(R.id.button_kg);
        Button button_bang = (Button)findViewById(R.id.button_bang);
        Button button_dan = (Button)findViewById(R.id.button_dan);
        button_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text_kg.getText().toString().equals("")) {
                    double value = Double.valueOf(text_kg.getText().toString());
                    text_bang.setText(String.valueOf(value * 2.20462262));
                    text_dan.setText(String.valueOf(value * 0.02));
                }
            }
        });
        button_bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text_bang.getText().toString().equals("")) {
                    double value = Double.valueOf(text_bang.getText().toString());
                    text_kg.setText(String.valueOf(value / 2.20462262));
                    text_dan.setText(String.valueOf(value / 2.20462262*0.02));
                }
            }
        });
        button_dan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text_dan.getText().toString().equals("")) {
                    double value = Double.valueOf(text_dan.getText().toString());
                    text_kg.setText(String.valueOf(value / 0.02));
                    text_bang.setText(String.valueOf(value * 2.20462262 / 0.02));
                }
            }
        });
    }
}
