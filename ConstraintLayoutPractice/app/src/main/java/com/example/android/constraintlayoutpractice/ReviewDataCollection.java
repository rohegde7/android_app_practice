package com.example.android.constraintlayoutpractice;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ReviewDataCollection extends BaseObservable {

    private int reviewCount = 0;
    private String review;

    public ReviewDataCollection(int count, String rev){
        reviewCount = count;
        review = rev;
    }

    @Bindable
    public int getReviewCount() {
        return reviewCount;
    }

    @Bindable
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
        notifyPropertyChanged(com.example.android.constraintlayoutpractice.BR.review);
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
        notifyPropertyChanged(com.example.android.constraintlayoutpractice.BR.reviewCount);
    }
}
