package com.example.android.dynamicmuliplicationtable;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.dynamicmuliplicationtable.databinding.ActivityMainBinding;
import com.example.android.dynamicmuliplicationtable.models.DimentionsOfMatrix;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mDimentions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mDimentions = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DimentionsOfMatrix dimentionsOfMatrix = new DimentionsOfMatrix(new Integer(5),new Integer(5));

        mDimentions.setMatrixDimentions(dimentionsOfMatrix);
        mDimentions.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToMatrixDisplay = new Intent(MainActivity.this, MatrixDisplayActivity.class);
                startActivity(intentToMatrixDisplay);
            }
        });
    }
}
