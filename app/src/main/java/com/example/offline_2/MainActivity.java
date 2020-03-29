package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Login;
    private EditText Name, Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.editText);
        Password =(EditText) findViewById(R.id.editText1);
        Login = (Button) findViewById(R.id.loginButtonId);
        Login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String userName = Name.getText().toString();
        String userPassword = Password.getText().toString();

        if(userName.equals("Noman Ahmed") && userPassword.equals("180104108")) {
            Intent intent = new Intent(MainActivity.this, NomanProfile.class);
            Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

            intent.putExtra("welcome", "Welcome " + userName);
            intent.putExtra("name", userName);
            intent.putExtra("studentId",userPassword);

            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
        }


    }
}
