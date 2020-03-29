package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ALPOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_l_p_opener);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        String getItem5 = getIntent().getStringExtra("ALPpdfFileName");

        if(getItem5.equals("Rules in Lab")) {
            pdfView.fromAsset("Rules_In_Lab_CSE2214.pdf").load();
        }
        if(getItem5.equals("Book")) {
            pdfView.fromAsset("ytha-yu-charles-marut-assembly-language-programming-organization-of-the-ibm-pc-1992.pdf").load();
        }
        if(getItem5.equals("Instructions")) {
            pdfView.fromAsset("Instructions.pdf").load();
        }
        if(getItem5.equals("Assignment Sample")) {
            pdfView.fromAsset("Assignment_Sample.pdf").load();
        }
        if(getItem5.equals("Lecture 1 - Microcomputer Systems")) {
            pdfView.fromAsset("Lecture 1 - Microcomputer Systems.pdf").load();
        }
        if(getItem5.equals("Assignment - 1")) {
            pdfView.fromAsset("Assignment 01.pdf").load();
        }
        if(getItem5.equals("Assignment - 1 - Solution")) {
            pdfView.fromAsset("Assignment 01 solve.pdf").load();
        }
        if(getItem5.equals("Lecture 2 - Number Systems")) {
            pdfView.fromAsset("Lecture 2 - Number Systems.pdf").load();
        }
        if(getItem5.equals("Assignment - 2")) {
            pdfView.fromAsset("Assignment02-C1.pdf").load();
        }
        if(getItem5.equals("Assignment - 2 - Solution")) {
            pdfView.fromAsset("Assignment 02 solve.pdf").load();
        }
        if(getItem5.equals("Lecture 3 - Organization of the IBM Personal Computers")) {
            pdfView.fromAsset("Lecture 03 - Organization of the IBM Personal Computers.pdf").load();
        }
        if(getItem5.equals("Assignment - 3")) {
            pdfView.fromAsset("Assignment 03.pdf").load();
        }
        if(getItem5.equals("Assignment - 3 - Solution")) {
            pdfView.fromAsset("Assignment 03 solve.pdf").load();
        }
        if(getItem5.equals("Lecture 4 - Introduction to IBM PC Assembly Language")) {
            pdfView.fromAsset("Lecture 4 - Introduction to IBM PC Assembly Language.pdf").load();
        }
        if(getItem5.equals("Assignment - 4")) {
            pdfView.fromAsset("Assignment 04.pdf").load();
        }
        if(getItem5.equals("Assignment - 4 - Solution")) {
            pdfView.fromAsset("Assignment 04 solve.pdf").load();
        }
    }
}
