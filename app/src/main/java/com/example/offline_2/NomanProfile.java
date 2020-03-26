package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NomanProfile extends AppCompatActivity implements View.OnClickListener{

    private Button button, logout;
    private TextView welcomeText, username, userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noman_profile);

        welcomeText =(TextView) findViewById(R.id.welcomeTextId);
        username =(TextView) findViewById(R.id.userNameShow);
        userid =(TextView) findViewById(R.id.userIdShow);
        logout = findViewById(R.id.logout_PageId);
        button =(Button) findViewById(R.id.next_Page_ButtonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondActivity();
            }
        });
        logout.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            String welcome = bundle.getString("welcome");
            String name = bundle.getString("name");
            String studentID = bundle.getString("studentId");

            welcomeText.setText(welcome);
            username.setText(name);
            userid.setText(studentID);
        }
    }

    public void secondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void mainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Confirm Logout?");
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //NomanProfile.super.onBackPressed();
                mainActivity();
                Toast.makeText(NomanProfile.this, "Logout successful", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
