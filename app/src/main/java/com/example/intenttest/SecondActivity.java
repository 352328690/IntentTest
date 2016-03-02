package com.example.intenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lenovo on 2016/3/2.
 */
public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = (TextView)findViewById(R.id.text);

        Person1 person1 = (Person1)getIntent().getSerializableExtra("person_data");

        try {
            textView.setText("姓名：" + person1.getName() + "  年龄：" + person1.getAge());
        }catch (RuntimeException r){
        }


        Person2 person2 = (Person2)getIntent().getParcelableExtra("person_data");

        try {
            textView.setText("姓名：" + person2.getName() + "  年龄：" + person2.getAge());
        }catch (RuntimeException r){
        }


    }
}
