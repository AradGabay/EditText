package com.example.aradg.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    EditText edt;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=(EditText)findViewById(R.id.et);
        txt=(TextView)findViewById(R.id.tv);
        btn=(Button)findViewById(R.id.confirmtext);
    }

    public void onclick(View view) {
        st1=edt.getText().toString();
        txt.setText("Hello "+st1);
    }
}
