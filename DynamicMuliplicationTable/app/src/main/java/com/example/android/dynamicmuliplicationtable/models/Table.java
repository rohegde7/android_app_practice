package com.example.android.dynamicmuliplicationtable.models;

public class Table {

    private int mRow;
    private int mColumn;
    int mTableMatrix[][];

    public Table(int row, int column){
        mRow = row;
        mColumn = column;
        createMatrix();
    }

    private void createMatrix(){
        int[][] tempMatrix = new int[mRow][mColumn];
        
        for(int i=0; i<mRow; i++){
            for(int j=0; j<mColumn; j++){
                if(i==0 || j==0){   //for numbering complete 1st row and column
                    if(i==0){
                        mTableMatrix[i][j] = j;  //traversing 1st row
                    }
                    if(j==0){
                        mTableMatrix[i][j] = i;  //traversing 1st column
                    }
                }
                else{   //storing the multiplication in cells other than the 1st row and column
                    mTableMatrix[i][j] = i*j;
                }
            }
        }
        mTableMatrix = tempMatrix;
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
