package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2,edt3;
    Button button;
    SharedPreferences sharedPreferences;
    public static final String Name="name";
    public static final String Branch="branch";
    public static final String DOB="dob";
    public static final String Mypreferences="myprefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt1=findViewById(R.id.editText);
        edt2=findViewById(R.id.editText2);
        edt3=findViewById(R.id.editText3);

        button=findViewById(R.id.button);
        sharedPreferences=getSharedPreferences(Mypreferences, Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n=edt1.getText().toString();
                String b=edt2.getText().toString();
                String d=edt3.getText().toString();

                SharedPreferences.Editor editor=sharedPreferences.edit();

                editor.putString("Name",n);
                editor.putString("Branch",b);
                editor.putString("DOB",d);

                editor.commit();

                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();






            }
        });




    }
}
