package com.example.android.dynamicmuliplicationtable.models;

import android.databinding.ObservableField;

public class DimentionsOfMatrix {

    public ObservableField<Integer> rows = new ObservableField<>();
    public ObservableField<Integer> columns = new ObservableField<>();
    //sdsaf ss;

    public DimentionsOfMatrix(Integer rows, Integer columns){ //,sdsaf sss){
        //ss = sss;
        this.rows.set(rows);
        this.columns.set(columns);
    }

    /*
    public void onButtonClick(){
        ss.switchAct();
    }
    */
}