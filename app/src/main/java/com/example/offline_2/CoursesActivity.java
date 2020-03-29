package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CoursesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    ListView coursesListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        button = (Button) findViewById(R.id.prevId);
        button.setOnClickListener(this);

        coursesListView = (ListView) findViewById(R.id.coursesList);

        String[] courseNames = {"CSE 2200 - Software Development - |||", "CSE 2201 - Numerical Methods", "CSE 2208 - Algorithms Lab",
                "CSE 2209 / 2210 - Digital Electronics and Pulse Techniques and Lab", "CSE 2213 - Computer Architecture",
                "CSE 2214 - Assembly Language Programming"};

        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courseNames);
        coursesListView.setAdapter(adapter);

        coursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    courseMaterial();
                }
                if(position == 1) {
                    nmActivity();
                }
                if(position == 2) {
                    alActivity();
                }
                if(position == 3) {
                    deptActivity();
                }
                if(position == 4) {
                    caActivity();
                }
                if(position == 5) {
                    assemblyActivity();
                }
            }
        });

    }

    public void nomanProfile() {
        Intent intent = new Intent(this, NomanProfile.class);

        intent.putExtra("welcome", "Welcome Noman Ahmed");
        intent.putExtra("name", "Noman Ahmed");
        intent.putExtra("studentId","1234");

        startActivity(intent);
    }

    public void courseMaterial() {
        Intent intent = new Intent(this, CourseMaterial.class);
        startActivity(intent);
    }

    public void assemblyActivity() {
        Intent intent = new Intent(this, AssemblyActivity.class);
        startActivity(intent);
    }

    public void caActivity() {
        Intent intent = new Intent(this, ComputerActivity.class);
        startActivity(intent);
    }

    public void nmActivity() {
        Intent intent = new Intent(this, NumericalActivity.class);
        startActivity(intent);
    }

    public void deptActivity() {
        Intent intent = new Intent(this, DigitialActivity.class);
        startActivity(intent);
    }

    public void alActivity() {
        Intent intent = new Intent(this, AlgoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.prevId) {
            nomanProfile();
        }
    }
}
