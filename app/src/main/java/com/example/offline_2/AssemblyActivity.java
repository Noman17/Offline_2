package com.example.offline_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class AssemblyActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    ListView mypdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assembly);

        button =(Button) findViewById(R.id.prev_PageId);
        button.setOnClickListener(this);

        mypdfListView =(ListView) findViewById(R.id.myList);

        String[] mypdfFiles = {"Rules in Lab", "Book", "Instructions", "Assignment Sample", "Lecture 1 - Microcomputer Systems", "Assignment - 1",
                "Assignment - 1 - Solution", "Lecture 2 - Number Systems", "Assignment - 2", "Assignment - 2 - Solution", "Lecture 3 - Organization of the IBM Personal Computers",
                "Assignment - 3", "Assignment - 3 - Solution", "Lecture 4 - Introduction to IBM PC Assembly Language", "Assignment - 4", "Assignment - 4 - Solution"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mypdfFiles) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText =(TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        mypdfListView.setAdapter(adapter);

        mypdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = mypdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(), ALPOpener.class);
                start.putExtra("ALPpdfFileName", item);
                startActivity(start);
            }
        });
    }

    public void coursesActivity() {
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.prev_PageId) {
            coursesActivity();
        }
    }
}
