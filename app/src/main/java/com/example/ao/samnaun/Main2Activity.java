package com.example.ao.samnaun;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements
        View.OnClickListener {
    String _name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
        _name = getIntent().getExtras().getString("Message");

        Button btnContent = (Button)findViewById(R.id.content_button);
        Button btnTest = (Button)findViewById(R.id.test_button);
        btnTest.setOnClickListener(this);
        btnContent.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.content_button:
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.test_button:
                Intent intent2 = new Intent(Main2Activity.this, Main4Activity.class);
                intent2.putExtra("Message",_name);
                startActivity(intent2);
                break;
        }
    }

}
