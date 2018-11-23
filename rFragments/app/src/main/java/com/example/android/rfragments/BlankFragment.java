package com.example.android.rfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    private static int count = 0;

    public BlankFragment() {
        // Required empty public constructor
        count++;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("BlankFragment activity", "Entered onCreateView()");
        Toast.makeText(getContext(), "The count: " + count, Toast.LENGTH_SHORT).show();
        Log.e("BlankFragment", "Leaving onCreateView()");
        return inflater.inflate(R.layout.fragment_blank, container, false);

    }

    @Override
    protected void finalize() throws Throwable {
        count--;
        Toast.makeText(getContext(), "The count: " + count, Toast.LENGTH_SHORT).show();
    }
}
