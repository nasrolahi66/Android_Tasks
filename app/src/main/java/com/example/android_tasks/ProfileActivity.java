package com.example.android_tasks;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final TextView txtName=findViewById(R.id.txtName);
        final TextView txtLastName=findViewById(R.id.txtLastName);
        final TextView txtEmail=findViewById(R.id.txtEmail);
        final TextView txtNumber=findViewById(R.id.txtNumber);
        txtName.setText( PreferenceManager.getDefaultSharedPreferences
                (ProfileActivity.this).getString("Name","Shirin"));

         txtLastName.setText( PreferenceManager.getDefaultSharedPreferences
                (ProfileActivity.this).getString("LastName","Nasrolahi"));

        txtEmail.setText( PreferenceManager.getDefaultSharedPreferences
                (ProfileActivity.this).getString("Email","Shirin@gmail.com"));

       txtNumber.setText( PreferenceManager.getDefaultSharedPreferences
                (ProfileActivity.this).getString("Number","09125252985"));
    }
}
