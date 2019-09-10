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
import android.widget.Toast;

public class JinzhiActivity extends AppCompatActivity {
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
                Intent intent =new Intent(JinzhiActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jinzhi);
        final EditText text_shi = (EditText)findViewById(R.id.text_shi);
        final EditText text_er = (EditText)findViewById(R.id.text_er);
        final EditText text_ba = (EditText)findViewById(R.id.text_ba);
        final EditText text_sl = (EditText)findViewById(R.id.text_sl);
        Button button_shi = (Button)findViewById(R.id.button_shi);
        Button button_er = (Button)findViewById(R.id.button_er);
        Button button_ba = (Button)findViewById(R.id.button_ba);
        Button button_sl = (Button)findViewById(R.id.button_sl);

            button_shi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if (!text_shi.getText().toString().equals("")) {
                            int value = Integer.valueOf(text_shi.getText().toString());
                            text_sl.setText(Integer.toHexString(value));
                            text_er.setText(Integer.toBinaryString(value));
                            text_ba.setText(Integer.toOctalString(value));
                        }
                    }
                    catch (Exception e) {
                        text_sl.setText("error");
                        text_er.setText("error");
                        text_ba.setText("error");
                    }
                }
            });
            button_er.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if (!text_er.getText().toString().equals("")) {
                            int value = Integer.valueOf(Integer.valueOf(text_er.getText().toString(), 2).toString());
                            text_shi.setText(Integer.toString(value));
                            text_sl.setText(Integer.toHexString(value));
                            text_ba.setText(Integer.toOctalString(value));
                        }
                    }catch (Exception e) {
                        text_shi.setText("error");
                        text_sl.setText("error");
                        text_ba.setText("error");
                    }
                }
            });

            button_ba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if (!text_ba.getText().toString().equals("")) {
                            int value = Integer.valueOf(Integer.valueOf(text_ba.getText().toString(), 8).toString());
                            text_sl.setText(Integer.toHexString(value));
                            text_er.setText(Integer.toBinaryString(value));
                            text_shi.setText(Integer.toString(value));
                        }
                    } catch (Exception e) {
                        text_shi.setText("error");
                        text_er.setText("error");
                        text_sl.setText("error");
                    }
                }
            });
            button_sl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if (!text_sl.getText().toString().equals("")) {
                            int value = Integer.valueOf(Integer.valueOf(text_sl.getText().toString(), 16).toString());
                            text_shi.setText(Integer.toString(value));
                            text_er.setText(Integer.toBinaryString(value));
                            text_ba.setText(Integer.toOctalString(value));
                        }
                    }
                    catch (Exception E){
                        text_shi.setText("error");
                        text_er.setText("error");
                        text_ba.setText("error");

                    }
                }
            });
        }
    }

