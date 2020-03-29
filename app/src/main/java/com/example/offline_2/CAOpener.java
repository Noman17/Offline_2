package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CAOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a_opener);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        String getItem4 = getIntent().getStringExtra("CApdfFileName");

        if(getItem4.equals("Course Outline")) {
            pdfView.fromAsset("OBE_Course_Outline_CSE2213_(Computer Architecture)_fall19.pdf").load();
        }
        if(getItem4.equals("Book")) {
            pdfView.fromAsset("hamacher-computer-organization-5th-ed.pdf").load();
        }
        if(getItem4.equals("Chapter 1")) {
            pdfView.fromAsset("Chapter 1.pdf").load();
        }
        if(getItem4.equals("Chapter 2")) {
            pdfView.fromAsset("Chapter 2.pdf").load();
        }
    }
}
