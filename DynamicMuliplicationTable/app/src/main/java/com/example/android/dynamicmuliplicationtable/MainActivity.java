package com.example.android.dynamicmuliplicationtable;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.dynamicmuliplicationtable.databinding.ActivityMainBinding;
import com.example.android.dynamicmuliplicationtable.models.DimentionsOfMatrix;
import com.example.android.dynamicmuliplicationtable.models.sdsaf;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity{// implements sdsaf {

    ActivityMainBinding mDimentions;
    private int mRows;
    private int mColumns;
    DimentionsOfMatrix dimentionsOfMatrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mDimentions = DataBindingUtil.setContentView(this, R.layout.activity_main);



         //, new sdsaf() {
           /*
            @Override
            public void switchAct() {


                Intent intentToMatrixDisplay = new Intent(MainActivity.this, MatrixDisplayActivity.class);
                intentToMatrixDisplay.putExtra("dimentionsOfMatrixObject", (Serializable)dimentionsOfMatrix);
                startActivity(intentToMatrixDisplay);
            }
        });
           */

           mDimentions.button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   mRows = Integer.parseInt(mDimentions.editText.getText().toString());
                   mColumns = Integer.parseInt(mDimentions.editText2.getText().toString());
                   dimentionsOfMatrix = new DimentionsOfMatrix(new Integer(mRows), new Integer(mColumns));
                   mDimentions.setMatrixDimentions(dimentionsOfMatrix);

                   Intent intentToMatrixDisplay = new Intent(MainActivity.this, MatrixDisplayActivity.class);
                   intentToMatrixDisplay.putExtra("Rows", Integer.parseInt(dimentionsOfMatrix.rows.get().toString()));
                   startActivity(intentToMatrixDisplay);
               }
           });

    }

    /*
    @Override
    public void switchAct() {
        mRows = Integer.parseInt(mDimentions.editText.getText().toString());
        mColumns = Integer.parseInt(mDimentions.editText2.getText().toString());

        Intent intentToMatrixDisplay = new Intent(MainActivity.this, MatrixDisplayActivity.class);
        intentToMatrixDisplay.putExtra("dimentionsOfMatrixObject", (Serializable)dimentionsOfMatrix);
        startActivity(intentToMatrixDisplay);
    }
    */
}
