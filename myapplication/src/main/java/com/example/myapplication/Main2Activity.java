package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.cert.CertPathBuilderSpi;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);






        textView = findViewById(R.id.txtview);

// Get the data through key value "object".

        Movie movie = getIntent().getParcelableExtra("object");
        textView.setText(movie.print());


    }
}
