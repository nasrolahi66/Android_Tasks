package com.example.android_tasks;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class Session4_task_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_task_);
        Button btnHambergerMenu=findViewById(R.id.btnHambergerMenu);
        final DrawerLayout drawer=findViewById(R.id.drawer);
        Button btnRegister=findViewById(R.id.btnRegister);
        Button btnCall=findViewById(R.id.btnCall);
        Button btnProfile=findViewById(R.id.btnProfile);
        btnHambergerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawer.openDrawer(Gravity.END);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Session4_task_Activity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Session4_task_Activity.this,CallActivity.class);
                startActivity(intent);

            }
        });
btnProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(Session4_task_Activity.this,ProfileActivity.class);
        startActivity(intent);
    }
});
    }
}
