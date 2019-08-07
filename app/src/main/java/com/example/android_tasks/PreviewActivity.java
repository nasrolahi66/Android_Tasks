package com.example.android_tasks;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        final TextView txtName=findViewById(R.id.txtName);
        final TextView txtLastName=findViewById(R.id.txtLastName);
        final TextView txtEmail=findViewById(R.id.txtEmail);
        final TextView txtNumber=findViewById(R.id.txtNumber);
        Button btnSave=findViewById(R.id.btnSave);
        Button btnEdit=findViewById(R.id.btnEdit);
        final Intent intent=getIntent();
      String name= intent.getStringExtra("FirstName");
       String lastName=intent.getStringExtra("LastName");
      String email= intent.getStringExtra("Email");
       String number=intent.getStringExtra("PhoneNumber");

        txtName.setText(name);
        txtLastName.setText(lastName);
        txtEmail.setText(email);
        txtNumber.setText(number);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceManager.getDefaultSharedPreferences(PreviewActivity.this).edit()
                        .putString("name", txtName.getText().toString())
                        .putString("lastName",txtLastName.getText().toString())
                        .putString("email",txtEmail.getText().toString())
                        .putString("number",txtNumber.getText().toString()).apply();
                Intent intent1=new Intent();

                setResult(Activity.RESULT_OK,intent1);
                finish();

            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();



            }
        });
    }
}
