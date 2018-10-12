package com.example.android.dynamicmuliplicationtable.models;

public class Table {

    public int mRow=0;
    public int mColumn=0;
    public int mTableMatrix[][] ;

    /*
    public int[][] sampleTable = {
            {0,1},
            {2,3}
    };
    */

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
