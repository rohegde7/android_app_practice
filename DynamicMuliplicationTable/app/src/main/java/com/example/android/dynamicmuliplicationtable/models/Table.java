package com.example.android.dynamicmuliplicationtable.models;

import android.content.Context;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.android.dynamicmuliplicationtable.MatrixDisplayActivity;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMatrixDisplayBinding;

public class Table {

    public int mRow=0;
    public int mColumn=0;
    public int mTableMatrix[][] ;
    private Context mContext;
    ActivityMatrixDisplayBinding mBinding;

    /*
    public int[][] sampleTable = {
            {0,1},
            {2,3}
    };
    */

    public Table(int row, int column, Context context, ActivityMatrixDisplayBinding mBinding){
        mRow = row;
        mColumn = column;
        this.mContext = context;
        this.mBinding = mBinding;
        createMatrix();
        createTableLayout();
    }

    private void createMatrix(){
        int[][] tempMatrix = new int[mRow][mColumn];
        
        for(int i=0; i<mRow; i++){
            for(int j=0; j<mColumn; j++){
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
        mTableMatrix = tempMatrix;
    }

    private void createTableLayout(){
        //TableLayout tableLayout = (TableLayout) mBinding.root_view_table_layout;
        TableLayout tableLayout = (TableLayout) mBinding.rootViewTableLayout;
        for(int i=0; i<mRow; i++){
            View view = new View(mContext);

            TableRow tableRow = new TableRow(mContext);
            for(int j=0; j<mColumn; j++){
                TextView columnTextView = new TextView(mContext);
                columnTextView.setText("" +mTableMatrix[i][j]);
                //columnTextView.setWidth(35);
                tableRow.addView(columnTextView);
            }
            tableLayout.addView(tableRow);
        }
    }

    public int[][] getMatrix(){
        return mTableMatrix;
    }

    public int getNumberOfRows(){
        return mRow;
    }

    public int getNumberOfColumns(){
        return mColumn;
    }
}