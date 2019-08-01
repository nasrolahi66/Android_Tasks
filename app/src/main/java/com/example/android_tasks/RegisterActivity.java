package com.example.android_tasks;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText edtFirstName=findViewById(R.id.edtName);
        final EditText edtLastName=findViewById(R.id.edtFamily);
        final EditText edtEmail=findViewById(R.id.edtMail);
        final EditText edtPhone=findViewById(R.id.edtPhone);
        Button btnPreview=findViewById(R.id.btnPreview);

        btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,PreviewActivity.class);
                intent.putExtra("FirstName",edtFirstName.getText().toString());
                intent.putExtra("LastName",edtLastName.getText().toString());
                intent.putExtra("Email",edtEmail.getText().toString());
                intent.putExtra("PhoneNumber",edtPhone.getText().toString());
                startActivityForResult(intent,123);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==123 &&  resultCode== Activity.RESULT_OK){
             EditText edtFirstName=findViewById(R.id.edtName);
             EditText edtLastName=findViewById(R.id.edtFamily);
             EditText edtEmail=findViewById(R.id.edtMail);
             EditText edtPhone=findViewById(R.id.edtPhone);

            PreferenceManager.getDefaultSharedPreferences(this)
                    .edit()
                    .putString("Name",edtFirstName.getText().toString())
                    .putString("LastName",edtLastName.getText().toString())
                    .putString("Email",edtEmail.getText().toString())
                    .putString("Number",edtPhone.getText().toString()).apply();
            edtFirstName.setText("");
            edtLastName.setText("");
            edtEmail.setText("");
            edtPhone.setText("");
            Toast.makeText(this,"Your Profile saved!",Toast.LENGTH_LONG).show();
            if ( requestCode==123 && resultCode==Activity.RESULT_CANCELED)
            {
                Intent intent=getIntent();
               String name= intent.getStringExtra("Name");
               String lastName=intent.getStringExtra("LastName");
               String email=intent.getStringExtra("Email");
               String number=intent.getStringExtra("Number");


                edtFirstName.setText(name);
                edtLastName.setText(lastName);
                edtEmail.setText(email);
                edtPhone.setText(number);



            }




        }

    }
}

