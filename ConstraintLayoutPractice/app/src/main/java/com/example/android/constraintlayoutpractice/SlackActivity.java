package com.example.android.constraintlayoutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SlackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slack);

        ArrayList<SlackDataObjectPOJO> slackArrayList = new ArrayList<>();

        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY" +
                        "sjdfnsodfosdfosjdofjsodsdjfosdfosdfjosdjfosdfjosjdf"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f426, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f942, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.ic_030_performance, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAYakdfjn sdjfisjdfisdfs" +
                        "sjdfnsodfosdfosjdofjsodsdjfosdfosdfjosdjfosdfjosjdf"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));
        slackArrayList.add(new SlackDataObjectPOJO(R.drawable.f332, "Rohit",
                "Hey I am Rohit...Working at NOVOPAY"));

        SlackDataAdapter slackDataAdapter = new SlackDataAdapter(this, slackArrayList);

        ListView slackRootView = (ListView) findViewById(R.id.slackRootViewListView);
        slackRootView.setAdapter(slackDataAdapter);
    }
}
