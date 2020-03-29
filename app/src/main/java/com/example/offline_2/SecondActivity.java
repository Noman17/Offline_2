package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button) findViewById(R.id.prev_Page_ButtonId);
        button1 = (Button) findViewById(R.id.next_Page_ButtonId);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    public void nomanProfile() {
        Intent intent = new Intent(this, NomanProfile.class);

        intent.putExtra("welcome", "Welcome Noman Ahmed");
        intent.putExtra("name", "Noman Ahmed");
        intent.putExtra("studentId","1234");

        startActivity(intent);
    }

    public void thirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.prev_Page_ButtonId) {
            nomanProfile();
        }
        else if(v.getId() == R.id.next_Page_ButtonId) {
            thirdActivity();
        }
    }
}
