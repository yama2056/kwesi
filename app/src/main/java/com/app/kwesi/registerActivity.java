package com.app.kwesi;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registerActivity extends AppCompatActivity {
EditText edtEmailAddressReg,edtFullnameReg,edtPasswordReg,edtDOB,edtPhoneNumber,edtNote;
Button btnLoginReg,btnRegisterReg;
TextView txtDisplayInfoReg;
;
dbConnect db =new dbConnect (this);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtEmailAddressReg = findViewById(R.id.edtEmailAddressReg);
        edtFullnameReg = findViewById(R.id.edtFullnameReg);
        edtPasswordReg = findViewById(R.id.edtPasswordReg);
        edtDOB = findViewById(R.id.edtDOBReg);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumberReg);
        edtNote = findViewById(R.id.edtNoteReg);
        txtDisplayInfoReg = findViewById(R.id.txtDisplayInfoReg);


        btnLoginReg = findViewById(R.id.btnLoginReg);
        btnRegisterReg = findViewById(R.id.btnRegisterReg);

        btnLoginReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(registerActivity.this, MainActivity.class);
                startActivity(i);

            }
        });
btnRegisterReg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String strFullname =edtFullnameReg.getText().toString();
        String strEmailAddress=edtEmailAddressReg.getText().toString();
        String strPassword=edtPasswordReg.getText().toString();
        String strphoneNumber =edtPhoneNumber.getText().toString();
        String strDOB =edtDOB.getText().toString();
        String strNote =edtNote.getText().toString();

        if (strFullname.isEmpty()&& strEmailAddress.isEmpty()&& strPassword.isEmpty()&& strDOB.isEmpty()&& strphoneNumber.isEmpty()&& strNote.isEmpty()){
            txtDisplayInfoReg.setText("All fields required");




        }else{
            txtDisplayInfoReg.setText("Successfully Login");
        }

    }
});
        btnRegisterReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(registerActivity.this, MainActivity.class);
                startActivity(i);

            }
        });



    }}