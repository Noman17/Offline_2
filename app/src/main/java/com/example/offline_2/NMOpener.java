package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class NMOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_m_opener);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        String getItem1 = getIntent().getStringExtra("NMpdfFileName");

        if(getItem1.equals("Important Information")) {
            pdfView.fromAsset("Important Information.pdf").load();
        }
        if(getItem1.equals("Introduction to Numerical Methods")) {
            pdfView.fromAsset("Introduction to Numerical Methods.pdf").load();
        }
        if(getItem1.equals("Approximations and Errors")) {
            pdfView.fromAsset("Approximations and Errors in numerical computing.pdf").load();
        }
        if(getItem1.equals("Assignment - 1")) {
            pdfView.fromAsset("Assignment1.pdf").load();
        }
    }
}
