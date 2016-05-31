package com.example.ao.samnaun;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main4Activity extends AppCompatActivity implements
        View.OnClickListener {
    RadioButton num1 , num2 , num3 , num4 , num5 , num6 , num7 , num8 , num9 ,num10
            ,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20;
    int sum = 0;
    String _name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main4);

        _name = getIntent().getExtras().getString("Message");
        Button btn = (Button) findViewById(R.id.ok_button);
        num1 = (RadioButton)findViewById(R.id.choice1_1);
        num2 = (RadioButton)findViewById(R.id.choice2_2);
        num3 = (RadioButton)findViewById(R.id.choice3_2);
        num4 = (RadioButton)findViewById(R.id.choice4_1);
        num5 = (RadioButton)findViewById(R.id.choice5_1);
        num6 = (RadioButton)findViewById(R.id.choice6_1);
        num7 = (RadioButton)findViewById(R.id.choice7_1);
        num8 = (RadioButton)findViewById(R.id.choice8_1);
        num9 = (RadioButton)findViewById(R.id.choice9_1);
        num10 = (RadioButton)findViewById(R.id.choice10_1);
        num11 = (RadioButton)findViewById(R.id.choice11_1);
        num12 = (RadioButton)findViewById(R.id.choice12_2);
        num13 = (RadioButton)findViewById(R.id.choice13_2);
        num14 = (RadioButton)findViewById(R.id.choice14_1);
        num15 = (RadioButton)findViewById(R.id.choice15_2);
        num16 = (RadioButton)findViewById(R.id.choice16_1);
        num17 = (RadioButton)findViewById(R.id.choice17_1);
        num18 = (RadioButton)findViewById(R.id.choice18_2);
        num19 = (RadioButton)findViewById(R.id.choice19_1);
        num20 = (RadioButton)findViewById(R.id.choice20_1);
        btn.setOnClickListener(this);
    }
    public void onClick(View v) {

        if(num1.isChecked()==true){
            sum++;
        }
        if(num2.isChecked()==true){
            sum++;
        }
        if(num3.isChecked()==true){
            sum++;
        }
        if(num4.isChecked()==true){
            sum++;
        }
        if(num5.isChecked()==true){
            sum++;
        }
        if(num6.isChecked()==true){
            sum++;
        }
        if(num7.isChecked()==true){
            sum++;
        }
        if(num8.isChecked()==true){
            sum++;
        }
        if(num9.isChecked()==true){
            sum++;
        }
        if(num10.isChecked()==true){
            sum++;
        }
        if(num11.isChecked()==true){
            sum++;
        }
        if(num12.isChecked()==true){
            sum++;
        }
        if(num13.isChecked()==true){
            sum++;
        }
        if(num14.isChecked()==true){
            sum++;
        }
        if(num15.isChecked()==true){
            sum++;
        }
        if(num16.isChecked()==true){
            sum++;
        }
        if(num17.isChecked()==true){
            sum++;
        }
        if(num18.isChecked()==true){
            sum++;
        }
        if(num19.isChecked()==true){
            sum++;
        }
        if(num20.isChecked()==true){
            sum++;
        }
        switch (v.getId()) {
            case R.id.ok_button:
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                intent.putExtra("Message",sum);
                intent.putExtra("Message2",_name);
                startActivity(intent);
                break;
        }
    }
}
