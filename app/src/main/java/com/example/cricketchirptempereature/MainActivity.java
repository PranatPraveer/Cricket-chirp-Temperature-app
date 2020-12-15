package com.example.cricketchirptempereature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tvresult;
    EditText etid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etid= findViewById(R.id.etid);
        tvresult= findViewById(R.id.tvresult);
        btn= findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (etid.getText().toString().isEmpty()){
                   Toast.makeText(MainActivity.this,"please enter number",Toast.LENGTH_SHORT).show();
               }
               else {
                   int chirps = Integer.parseInt(etid.getText().toString().trim());
                   double temp = (chirps / 3.0) + 4;
                   String result = "The approximate temperature outside is " + temp + " degree celcius";
                   tvresult.setText(result);
               }
            }
        });
    }
}