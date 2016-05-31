package com.example.ao.samnaun;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    EditText name;
    String _name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main); //ให้แสดงหน้า content_main
        Button btnSubmit = (Button)findViewById(R.id.submit_button); //สร้างตัวแปรอ้างไป ปุ่ม ตกลง
        btnSubmit.setOnClickListener(this); //เมื่อกดปุ่ม
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.submit_button: //เมื่อกดปุ่มที่อ้างมาไอดี ตกลง ให้ทำ
                name = (EditText)findViewById(R.id.name_edit); // สร้างตัวแปรอ้างไป ไอดีของที่ใส่ชื่อ
                _name = name.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class); //กำหนดว่าจากหน้าไหนไปหน้าไหน
                intent.putExtra("Message",_name);
                startActivity(intent); //เมื่อเจอคำสั่งนี้จะไปหน้าที่กำหนด
                break;
        }
    }
}
