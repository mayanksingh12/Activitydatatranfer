package com.example.activitydatatranfer;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {

    TextView txt1,txt2;
    EditText edt1,edt2,edt3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        txt1=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView7);
        edt1=findViewById(R.id.editText);
        edt2=findViewById(R.id.editText2);
        edt3=findViewById(R.id.editText3);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(FirstScreen.this,SecondScreen.class);
                intent1.putExtra("Firstname",edt1.getText().toString());
                intent1.putExtra("Secondname",edt2.getText().toString());
                intent1.putExtra("DOB",edt3.getText().toString());
             startActivityForResult(intent1,1);

            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //if (requestCode)
        txt2.setText(data.getStringExtra("confirmation"));
    }

//    public void mt(String string){
//        Toast.makeText(this,string,Toast.LENGTH_LONG).show();
//    }


}
