package com.example.android.rfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadFragment1(View v){
        Log.e("MAIN activity", "Entered loadFragment1()");
        FragmentManager fragmentManager = getSupportFragmentManager();

        BlankFragment blankFragment = new BlankFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_frame_Layout, blankFragment, "First Fragment");

        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        fragmentManager.executePendingTransactions();
    }

    public void loadFragment2(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(R.id.fragment_container_frame_Layout, new BlankFragment2());
        Toast.makeText(this, "Fragment 2", Toast.LENGTH_SHORT).show();

        fragmentTransaction.commit();
    }
}
