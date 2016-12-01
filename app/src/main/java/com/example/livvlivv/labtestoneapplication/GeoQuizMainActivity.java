package com.example.livvlivv.labtestoneapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GeoQuizMainActivity extends AppCompatActivity {

    Button myButton_true,myButton_false;
    TextView tv_question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz_lmain);
        myButton_true = (Button)findViewById(R.id.button_lT);
        myButton_false =(Button)findViewById(R.id.button_lF);
        tv_question=(TextView)findViewById(R.id.textView_lq);
        myButton_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoQuizMainActivity.this,"选择了F！",Toast.LENGTH_SHORT).show();
            }
        });
        myButton_true.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoQuizMainActivity.this,"选择了T！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
