package com.example.android.dynamicmuliplicationtable.models;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.android.dynamicmuliplicationtable.MatrixDisplayActivity;
import com.example.android.dynamicmuliplicationtable.R;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMatrixDisplayBinding;

public class Table {

    public static int mRow=0;
    public static int mColumn=0;

    //Creating the tables and the scroll views for the FINAL Layout


    /*
    public int[][] sampleTable = {
            {0,1},
            {2,3}
    };
    */

    public Table(int row, int column){
        mRow = row;
        mColumn = column;

    }

    public int getNumberOfRows(){
        return mRow;
    }

    public int getNumberOfColumns(){
        return mColumn;
    }


    /*
    private void createBasiclayout(){
        TableLayout tableLayoutMain = (TableLayout) mBinding.rootViewTableLayout;

        //creating the A section table:
        TableLayout tableLayoutA = new TableLayout(mContext);
        tableLayoutA.setId(R.id.tableLayoutA);

        TableRow tableRowA = new TableRow(mContext);
        tableRowA.setId(R.id.tableRowA);

        TextView textViewA = new TextView(mContext);
        textViewA.setId(R.id.textViewA);
        textViewA.setText("MultiTable");

        tableRowA.addView(textViewA);
        tableLayoutA.addView(tableRowA);
        //A Section table created

        //adding the A section table to the MAIN table:
        TableRow tableRowMain = new TableRow(mContext);
        tableRowMain.setId(R.id.tableRowMain);

        tableRowMain.addView(tableLayoutA);
        tableLayoutMain.addView(tableRowMain);
        //added A section to the main table layout

        //creating the COMPONENT B,C,D and adding it to the MainROW view
        HorizontalScrollView horizontalScrollViewB = new HorizontalScrollView(mContext);
        horizontalScrollViewB.setId(R.id.horizontalScrollViewB);
        tableRowMain.addView(horizontalScrollViewB);
        //created the B view - horizontalScrollViewB and added to the 1st COLUMN

        //creating section C - scroll view and adding it to the main table layout:
        TableRow tableRowC = new TableRow(mContext);
        tableRowC.setId(R.id.tableRowC);
        tableLayoutMain.addView(tableRowC);
        ScrollView scrollView = new ScrollView(mContext);
        tableRowC.addView(scrollView);
        //done creating and adding it to the MAIN table layout

        //creating the section D and adding it to the RowC layout:
        HorizontalScrollView horizontalScrollViewD = new HorizontalScrollView(mContext);
        horizontalScrollViewD.setId(R.id.horizontalScrollViewD);
        tableRowC.addView(horizontalScrollViewD);
        //done with all the 4 SECTIONS
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

    private void createTableB(){
        TableLayout tableB = new TableLayout(mContext);
        tableB.setId(R.id.tableB);
        TableRow tableBRow = new TableRow(mContext);
        tableBRow.setId(R.id.tableBRow);

        for(int i=1; i<=mColumn; i++){
            TextView textView = new TextView(mContext);
            textView.setText("" +i);
            tableBRow.addView(textView);
        }
        tableB.addView(tableBRow);
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

    */


}