package com.example.android.rmusicplayer;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer musicPlayer;
    private AudioManager audioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(){
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS){
                audioManager.registerMediaButtonEventReceiver(RemoteControlReceiver);
                releaseMediaPlayerObject();
            }
            else if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT){
                musicPlayer.pause();
            }
            else if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                musicPlayer.pause();
            }
            else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
                musicPlayer.start();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        Button playButton = (Button) findViewById(R.id.playMusic_Button);
        Button pauseButton = (Button) findViewById(R.id.pauseMusic_Button);
        Button stopButton = (Button) findViewById(R.id.stopmusic_Button);
        Button seekleftButton = (Button) findViewById(R.id.seekbefore_Button);
        Button seekrightButton = (Button) findViewById(R.id.seekafter_Button);



        ///*
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Music playing", Toast.LENGTH_SHORT).show();
                releaseMediaPlayerObject();
                int result = audioManager.requestAudioFocus(mOnAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);

                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
                    audioManager.registerMediaButtonEventReceiver(RemoteControlReceiver);

                    musicPlayer = MediaPlayer.create(MainActivity.this, R.raw.andhadhun_title_track);
                    musicPlayer.start();
                }

            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pause();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Music player terminated", Toast.LENGTH_SHORT).show();
                musicPlayer.reset();
                releaseMediaPlayerObject();
            }
        });

        seekleftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = musicPlayer.getCurrentPosition();
                musicPlayer.seekTo(currentPosition - 10000);
            }
        });

        seekrightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = musicPlayer.getCurrentPosition();
                musicPlayer.seekTo(currentPosition + 10000);
            }
        });



        //*/
    }

    @Override
    protected void onStop() {
        super.onStop();

        releaseMediaPlayerObject();
    }

    private void releaseMediaPlayerObject(){
        if(musicPlayer != null){
            musicPlayer.release();
            musicPlayer = null;

            audioManager.abandonAudioFocus(mOnAudioFocusChangeListener  );
        }


    }
}
