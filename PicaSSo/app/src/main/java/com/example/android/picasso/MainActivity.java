package com.example.android.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sampleImage = (ImageView) findViewById(R.id.image1);

        Picasso.get().load("https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2018/02/google-pacman-796x419.jpg").into(sampleImage);
    }
}
