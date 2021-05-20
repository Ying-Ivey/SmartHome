package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String signInfo = "<p>Manage Your Device &#38; Accessory</p>\n";
    String createAcc = "<p><u>Create an acount</u></p>";
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtSignInfo = findViewById(R.id.txtSignInfo2);
        txtSignInfo.setText(HtmlCompat.fromHtml(signInfo, 0));

        TextView txtCreateAcc = findViewById(R.id.txtCreateAcc2);
        txtCreateAcc.setText(HtmlCompat.fromHtml(createAcc, 0));


        tv1= (TextView)findViewById(R.id.txtCreateAcc2);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this text is clicked", Toast.LENGTH_LONG).show();
            }
        });

    }


}