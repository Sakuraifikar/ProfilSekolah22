package com.example.profilsekolah2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ProfilActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("profil.pdf").load();
    }
}