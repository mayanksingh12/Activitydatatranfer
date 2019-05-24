package com.example.activitydatatranfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
TextView tv1,tv2,tv3;
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.name);
        tv3=findViewById(R.id.dob);


        editText=findViewById(R.id.ed1);
        button=findViewById(R.id.button2);

        Intent intent2=getIntent();

        Bundle bundle=intent2.getExtras();
        String First=bundle.getString("Firstname");
        String Second=bundle.getString("Secondname");
        String DOB=bundle.getString("DOB");

        tv2.setText(":  "+First+" "+Second);
        tv3.setText(":  "+DOB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent();
                intent2.putExtra("confirmation",editText.getText().toString());
                setResult(RESULT_OK,intent2);
                finish();
            }
        });

    }

}
