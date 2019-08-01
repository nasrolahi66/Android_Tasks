package com.example.android_tasks;

import android.app.Activity;
import android.content.Intent;
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
                Intent intent1=new Intent();
                String name=txtName.getText().toString();
                String lastName=txtLastName.getText().toString();
                String email=txtEmail.getText().toString();
                String number=txtNumber.getText().toString();
                intent1.putExtra("Name",name);
                intent1.putExtra("LastName",lastName);
                intent1.putExtra("Email",email);
                intent1.putExtra("Number",number);
                setResult(Activity.RESULT_OK,intent1);
                finish();
            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                String name=txtName.getText().toString();
                String lastName=txtLastName.getText().toString();
                String email=txtEmail.getText().toString();
                String number=txtNumber.getText().toString();
                intent1.putExtra("Name",name);
                intent1.putExtra("LastName",lastName);
                intent1.putExtra("Email",email);
                intent1.putExtra("Number",number);
                setResult(Activity.RESULT_CANCELED,intent);
                finish();



            }
        });
    }
}
