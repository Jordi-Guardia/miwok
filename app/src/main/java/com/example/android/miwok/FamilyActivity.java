package com.example.android.miwok;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.category_family);
        setContentView(R.layout.activity_family);
    }
}