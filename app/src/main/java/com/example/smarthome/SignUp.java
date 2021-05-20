package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    String title = "<b>WELCOME TO</b>";
    String title2 = "<b>SMART HOME</b>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView txtSignInfo = findViewById(R.id.txtTitle);
        txtSignInfo.setText(HtmlCompat.fromHtml(title, 0));

        TextView txtCreateAcc = findViewById(R.id.txtTitle2);
        txtCreateAcc.setText(HtmlCompat.fromHtml(title2, 0));



    }
}