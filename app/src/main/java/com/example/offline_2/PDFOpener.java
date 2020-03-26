package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opener);

        myPDFViewer =(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Course Outline")) {
            myPDFViewer.fromAsset("CSE2200 - Software Development III.pdf").load();
        }
        if(getItem.equals("Android Studio Installation")) {
            myPDFViewer.fromAsset("Android Studio Installation.pdf").load();
        }
        if(getItem.equals("Introduction")) {
            myPDFViewer.fromAsset("Introduction.pdf").load();
        }
        if(getItem.equals("Offline 01")) {
            myPDFViewer.fromAsset("Offline_1.pdf").load();
        }
        if(getItem.equals("Lab 02")) {
            myPDFViewer.fromAsset("Lab2.pdf").load();
        }
        if(getItem.equals("Lab 03")) {
            myPDFViewer.fromAsset("Lab3.pdf").load();
        }
        if(getItem.equals("Offline 02")) {
            myPDFViewer.fromAsset("Offline_2.pdf").load();
        }
    }
}
