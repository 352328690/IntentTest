package com.example.intenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;

//    使用Intent传递对象两种方法
//    1,Serializable 序列化方式较简单但是效率低
//    2,Parcelable 方法复杂一些但是效率高
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person1 person1 = new Person1();
                person1.setName("狗剩");
                person1.setAge(23);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("person_data", person1);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person2 person2 = new Person2();
                person2.setName("鸭蛋");
                person2.setAge(18);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("person_data", person2);
                startActivity(intent);
            }
        });


    }


}
