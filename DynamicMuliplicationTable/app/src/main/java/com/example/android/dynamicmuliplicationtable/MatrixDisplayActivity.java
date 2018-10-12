package com.example.android.dynamicmuliplicationtable;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.dynamicmuliplicationtable.databinding.ActivityMainBinding;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMatrixDisplayBinding;
import com.example.android.dynamicmuliplicationtable.models.Table;

public class MatrixDisplayActivity extends AppCompatActivity {

    ActivityMatrixDisplayBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_matrix_display);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_matrix_display);
        Table matrixTable = new Table(2,2);
        mBinding.setMatrixTable(matrixTable);
    }
}
