package com.example.android.dynamicmuliplicationtable;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.android.dynamicmuliplicationtable.Util.IntegerUtil;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMainBinding;
import com.example.android.dynamicmuliplicationtable.databinding.ActivityMatrixDisplayBinding;
import com.example.android.dynamicmuliplicationtable.models.DimentionsOfMatrix;
import com.example.android.dynamicmuliplicationtable.models.Table;

public class MatrixDisplayActivity extends AppCompatActivity {

    ActivityMatrixDisplayBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_matrix_display);

        int row = getIntent().getExtras().getInt("Rows");

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_matrix_display);

        //int r = Integer.parseInt(dOfMatrix.rows.get().toString());
        //int c = Integer.parseInt(dOfMatrix.columns.get().toString());

        Table matrixTable = new Table(row,row, getBaseContext(), mBinding);
        mBinding.setMatrixTable(matrixTable);

    }
}