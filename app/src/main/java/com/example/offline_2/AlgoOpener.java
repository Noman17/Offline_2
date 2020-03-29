package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AlgoOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo_opener);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        String getItem2 = getIntent().getStringExtra("AlgopdfFileName");

        if(getItem2.equals("Course Outline")) {
            pdfView.fromAsset("CSE 2208 Course Outline.pdf").load();
        }
        if(getItem2.equals("Lab Manual")) {
            pdfView.fromAsset("CSE 2208 Lab Manual.pdf").load();
        }
        if(getItem2.equals("Evaluation Policy")) {
            pdfView.fromAsset("CSE2208 Evaluation Policy.pdf").load();
        }
        if(getItem2.equals("Book")) {
            pdfView.fromAsset("Introduction_to_algorithms-3rd Edition.pdf").load();
        }
        if(getItem2.equals("Lab - 1")) {
            pdfView.fromAsset("CSE-2208-Lab-Manual-Quick-and-Merge-Sort.pdf").load();
        }
        if(getItem2.equals("Online - 1")) {
            pdfView.fromAsset("Online 1 _ Quick Merge.pdf").load();
        }
        if(getItem2.equals("Graph Representation")) {
            pdfView.fromAsset("Graph Representation.pdf").load();
        }
        if(getItem2.equals("Assignment Cover")) {
            pdfView.fromAsset("Assignment Cover Format.pdf").load();
        }
    }
}
