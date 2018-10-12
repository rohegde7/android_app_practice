package com.example.android.dynamicmuliplicationtable.models;

import android.databinding.ObservableField;


public class DimentionsOfMatrix {

    public ObservableField<Integer> rows = new ObservableField<>();
    public ObservableField<Integer> columns = new ObservableField<>();

    public DimentionsOfMatrix(Integer rows, Integer columns){
        this.rows.set(rows);
        this.columns.set(columns);
    }
}
