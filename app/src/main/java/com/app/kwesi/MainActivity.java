package com.app.kwesi;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtEmailAddressLog, edtPasswordLog;
    Button btnLoginLog, btnRegisterLog;
    dbConnect db = new dbConnect(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmailAddressLog = findViewById(R.id.edtEmailAddressLog);
        edtPasswordLog = findViewById(R.id.edtPasswordLog);
        btnLoginLog = findViewById(R.id.btnLoginLog);
        btnRegisterLog = findViewById(R.id.btnRegisterLog);

        btnRegisterLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, registerActivity.class);
                startActivity(i);
            }
        });

        btnLoginLog.setOnClickListener(View -> {
            String inputedtEmailAddressLog = edtEmailAddressLog.getText().toString();
            String inputedtPasswordLog = edtPasswordLog.getText().toString();


            if (inputedtEmailAddressLog.isEmpty() || inputedtPasswordLog.isEmpty()) {
                Snackbar.make(btnLoginLog, "please enter EMAIL and PASSWORD", Snackbar.LENGTH_LONG).show();
                return;
            }
            if (inputedtEmailAddressLog.equals("rupakdahal@gmail.com") && inputedtPasswordLog.equals("admin")) {
                Intent intent = new Intent(MainActivity.this, adminActivity.class);
                startActivity(intent);
            }

        });
    }
}