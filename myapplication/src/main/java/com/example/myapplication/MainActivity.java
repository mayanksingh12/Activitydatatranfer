package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        et1 = findViewById(R.id.edtxt);
        et2 = findViewById(R.id.edtxt2);
        et3 = findViewById(R.id.edtxt3);


        // On the button click sending an object from one activity to another .

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("object", new Movie(et1.getText().toString(), Integer.parseInt(et2.getText().toString()), et3.getText().toString()));
                startActivity(intent);
            }
        });

//        Intent i=new Intent(MainActivity.this,Main2Activity.class);
//        i.putExtra("movie",);
//        startActivity(i);
    }
}
