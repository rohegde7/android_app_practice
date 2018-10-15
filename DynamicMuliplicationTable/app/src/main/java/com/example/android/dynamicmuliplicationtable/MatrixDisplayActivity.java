package com.example.android.dynamicmuliplicationtable;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.android.dynamicmuliplicationtable.Util.IntegerUtil;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMainBinding;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMatrixDisplayBinding;
import com.example.android.dynamicmuliplicationtable.models.DimentionsOfMatrix;
import com.example.android.dynamicmuliplicationtable.models.Table;

import org.w3c.dom.Text;

public class MatrixDisplayActivity extends AppCompatActivity {

    ActivityMatrixDisplayBinding mBinding;
    private int mRow=100, mColumn=100;
    int mTableMatrix[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_matrix_display);

        int row = getIntent().getExtras().getInt("Rows");

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_matrix_display);

        //int r = Integer.parseInt(dOfMatrix.rows.get().toString());
        //int c = Integer.parseInt(dOfMatrix.columns.get().toString());

        Table matrixTable = new Table(row,row);
        mBinding.setMatrixTable(matrixTable);

        this.mRow = matrixTable.mRow;
        this.mColumn = matrixTable.mColumn;

        //mTableMatrix = mBinding.getMatrix();

        createTableLayout();
    }

    private void createBasiclayout(){
        TableLayout tableLayoutMain = (TableLayout) mBinding.rootViewTableLayout;

        //creating the A section table:
        TableLayout tableA = new TableLayout(this);
        tableA.setId(R.id.tableA);

        TableRow tableRowA = new TableRow(this);
        tableRowA.setId(R.id.tableRowA);

        TextView textViewA = new TextView(this);
        textViewA.setId(R.id.textViewA);
        textViewA.setText("MultiTable");
        textViewA.setPadding(20,20,20,20);

        tableRowA.addView(textViewA);
        tableA.addView(tableRowA);
        //A Section table created

        //adding the A section table to the MAIN table:
        TableRow tableRowMain1 = new TableRow(this);
        tableRowMain1.setId(R.id.tableRowMain1);

        tableRowMain1.addView(tableA);

        //added A section to the main table layout

        //creating the COMPONENT B and adding it to the MainROW view:
        HorizontalScrollView horizontalScrollViewB = new HorizontalScrollView(this);
        horizontalScrollViewB.setBackgroundColor(Color.RED);
        horizontalScrollViewB.setId(R.id.horizontalScrollViewB);
        tableRowMain1.addView(horizontalScrollViewB);
        //created the B view - horizontalScrollViewB and added to the 1st COLUMN

        //creating section C - scroll view and adding it to the main table layout:
        TableRow tableRowMain2 = new TableRow(this);
        tableRowMain2.setId(R.id.tableRowMain2);

        ScrollView scrollViewC = new ScrollView(this);
        scrollViewC.setId(R.id.scrollViewC);

        tableRowMain2.addView(scrollViewC);
        //done creating and adding it to the MAIN table layout

        //creating the section D and adding it to the RowC layout:
        ScrollView scrollViewD = new ScrollView(this);
        scrollViewD.setId(R.id.scrollViewD);
        HorizontalScrollView horizontalScrollViewD = new HorizontalScrollView(this);
        horizontalScrollViewD.setId(R.id.horizontalScrollViewD);
        scrollViewD.addView(horizontalScrollViewD);
        tableRowMain2.addView(scrollViewD);
        //done with all the 4 SECTIONS

        tableLayoutMain.addView(tableRowMain1);
        tableLayoutMain.addView(tableRowMain2);
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
        TableLayout tableB = new TableLayout(this);
        tableB.setId(R.id.tableB);
        TableRow tableBRow = new TableRow(this);
        tableBRow.setId(R.id.tableBRow);
        //tableBRow.setMinimumWidth(40);

        for(int i=1; i<=mColumn; i++){
            TextView textView = new TextView(this);
            textView.setText("" +i);
            textView.setPadding(20,20,20,20);
            //textView.setWidth(2);
            tableBRow.addView(textView);
        }
        tableB.addView(tableBRow);

        HorizontalScrollView hScroll = (HorizontalScrollView) findViewById(R.id.horizontalScrollViewB);
        hScroll.addView(tableB);
    }

    private void createTableC(){
        TableLayout tableC = new TableLayout(this);
        tableC.setId(R.id.tableC);
        //TableRow tableCrow = new TableRow(this);
        //tableCrow.setId(R.id.tableCRow);

        for(int i=1; i<=mRow; i++){
            TableRow tableCrow = new TableRow(this);

            TextView textView = new TextView(this);
            textView.setText("" +i);
            textView.setPadding(20,20,20,20);
            tableCrow.addView(textView);
            tableC.addView(tableCrow);
        }

        ScrollView scroll = (ScrollView) findViewById(R.id.scrollViewC);
        scroll.addView(tableC);
    }

    private void createTableD(){
        TableLayout tableD = new TableLayout(this);
        tableD.setId(R.id.tableD);

        for(int i=1; i<=mRow; i++){
            TableRow tableRow = new TableRow(this);

            for(int j=1; j<=mColumn; j++){
                TextView textView = new TextView(this);
                textView.setText("" +(i*j));
                textView.setPadding(20,20,20,20);
                tableRow.addView(textView);
            }
            tableD.addView(tableRow);
        }

        HorizontalScrollView hScroll = (HorizontalScrollView) findViewById(R.id.horizontalScrollViewD);
        hScroll.addView(tableD);
    }


    private void createTableLayout(){
        createMatrix();
        createBasiclayout();
        createTableB();
        createTableC();
        createTableD();

    }
}