package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DEPTOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_e_p_t_opener);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        String getItem3 = getIntent().getStringExtra("DEPTpdfFileName");

        if(getItem3.equals("Course Outline for Theory")) {
            pdfView.fromAsset("Course Plan CSE2209 (DEPT).pdf").load();
        }
        if(getItem3.equals("Course Outline for Lab")) {
            pdfView.fromAsset("Course Plan CSE2210 (DEPT Lab).pdf").load();
        }
        if(getItem3.equals("Lab Report Cover")) {
            pdfView.fromAsset("CSE2210 Cover Page.pdf").load();
        }
        if(getItem3.equals("Lab Experiments")) {
            pdfView.fromAsset("DEPT Lab Experiment.pdf").load();
        }
        if(getItem3.equals("Quiz - 1 - Solution")) {
            pdfView.fromAsset("Solution Quiz-1.pdf").load();
        }
    }
}
