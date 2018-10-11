package com.example.android.constraintlayoutpractice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SlackDataAdapter extends ArrayAdapter<SlackDataObjectPOJO> {

    public SlackDataAdapter(Activity activity, ArrayList slackArrayList){
        super(activity, 0, slackArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View slackRootView = convertView;
        if(slackRootView == null){
            slackRootView = LayoutInflater.from(getContext()).inflate(
                    R.layout.slack_custom_card_activity, parent, false);
        }

        SlackDataObjectPOJO slackDataObjectPOJO = getItem(position);

        ImageView userPicImageView = (ImageView)
                slackRootView.findViewById(R.id.imageUserPic);
        TextView userNameTextView = (TextView)
                slackRootView.findViewById(R.id.textViewUserName);
        TextView userMessageTextView = (TextView)
                slackRootView.findViewById(R.id.textViewUserMessage);

        userPicImageView.setImageResource(slackDataObjectPOJO.getImageResourceId());
        userNameTextView.setText(slackDataObjectPOJO.getUserName());
        userMessageTextView.setText(slackDataObjectPOJO.getMessage());

        return slackRootView;
    }
}
