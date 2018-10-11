package com.example.android.constraintlayoutpractice;

public class SlackDataObjectPOJO {

    int mImageResourceId;
    String mUserName;
    String mMessage;

    public SlackDataObjectPOJO(int imageResourceId, String userName, String message){
        mImageResourceId = imageResourceId;
        mUserName = userName;
        mMessage = message;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getUserName(){
        return mUserName;
    }

    public String getMessage(){
        return mMessage;
    }
}