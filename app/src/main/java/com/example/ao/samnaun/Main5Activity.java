package com.example.ao.samnaun;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main5Activity extends AppCompatActivity {
    String _name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main5);

        int sum = getIntent().getExtras().getInt("Message");
        _name = getIntent().getExtras().getString("Message2");
        TextView name = (TextView)findViewById(R.id.textView10);
        name.setText("ชื่อ " + _name);
        TextView _sum = (TextView)findViewById(R.id.show_sum);
        _sum.setText(Integer.toString(sum) + " คะแนน");

    }

}
