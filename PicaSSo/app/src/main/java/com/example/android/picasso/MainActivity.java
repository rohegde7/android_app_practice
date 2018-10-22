package com.example.android.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sampleImage = (ImageView) findViewById(R.id.image1);

        Picasso picassoImage = Picasso.get();

        picassoImage.load("https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2018/02/google-pacman-796x419.jpg")
                .networkPolicy(NetworkPolicy.NO_CACHE).networkPolicy(NetworkPolicy.NO_STORE)
                .memoryPolicy(MemoryPolicy.NO_CACHE).memoryPolicy(MemoryPolicy.NO_STORE)
                .placeholder(R.drawable.ic_launcher_background).into(sampleImage);

        picassoImage.setIndicatorsEnabled(true);

        //Picasso.get().load(R.drawable.ic_computer_svgrepo_com).placeholder(R.drawable.ic_launcher_background).into(sampleImage);
    }
}
