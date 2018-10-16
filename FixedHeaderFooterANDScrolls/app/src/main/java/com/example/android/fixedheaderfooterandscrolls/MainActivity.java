package com.example.android.fixedheaderfooterandscrolls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[][] mMatrix;
    private int mRows=25, mColumns=25;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMatrix();
        createA();
        createB();
        createC();
        createD();
    }

    private void createMatrix(){
        mMatrix = new int[mRows][mColumns];
        int[][] tempMatrix = new int[mRows][mColumns];

        for(int i=0; i<mRows; i++){
            for(int j=0; j<mColumns; j++){
                if(i==0 || j==0){   //for numbering complete 1st row and column
                    if(i==0){
                        tempMatrix[i][j] = j;  //traversing 1st row
                    }
                    if(j==0){
                        tempMatrix[i][j] = i;  //traversing 1st column
                    }
                }
                else{   //storing the multiplication in cells other than the 1st row and column
                    tempMatrix[i][j] = i*j;
                }
            }
        }
        mMatrix = tempMatrix;
    }

    private void createA(){
        HorizontalScrollView horizontalScrollViewA = (HorizontalScrollView)findViewById(R.id.horizontalScrollViewA);

        LinearLayout linearLayoutA = new LinearLayout(this);
        linearLayoutA.setOrientation(LinearLayout.HORIZONTAL);

        for(int i=1; i<=mRows; i++){
            TextView textView = new TextView(this);
            textView.setText("" +i);
            linearLayoutA.addView(textView);
        }

        horizontalScrollViewA.addView(linearLayoutA);
    }

    private void createB(){

    }

    private void createC(){

    }

    private void createD(){

    }
}
