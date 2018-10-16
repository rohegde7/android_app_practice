package com.example.android.dynamicmuliplicationtable;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import android.widget.ScrollView;

public class SyncedHorizontalScrollView extends HorizontalScrollView implements ScrollNotifier {

    //...

    private ScrollListener scrollListener = null;

    private OverScroller scroller;
    private Runnable scrollerTaskRunnable;

    public SyncedHorizontalScrollView(Context context) {
        super(context);
        init();
    }

    public SyncedHorizontalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SyncedHorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        scroller = new OverScroller(getContext());
        scrollerTaskRunnable = new Runnable() {
            @Override
            public void run() {
                scroller.computeScrollOffset();

                smoothScrollTo(0, scroller.getCurrY());

                if (!scroller.isFinished()) {
                    SyncedHorizontalScrollView.this.post(this);
                } else {
                    //deceleration ends here, do your code
                    ViewCompat.postInvalidateOnAnimation(SyncedHorizontalScrollView.this);
                }
            }
        };
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (scrollListener != null)
            scrollListener.onScrollChanged(this, l, t, oldl, oldt);
    }

    @Override
    public ScrollListener getScrollListener() {
        return scrollListener;
    }

    @Override
    public void setScrollListener(ScrollListener scrollListener) {
        this.scrollListener = scrollListener;
    }

    @Override
    public void fling(int velocityY) {

        scroller.forceFinished(true);
        scroller.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, 0, getChildAt(0).getHeight());
        post(scrollerTaskRunnable);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
//        return super.onTouchEvent(ev);
        boolean eventConsumed = super.onTouchEvent(ev);
        if (eventConsumed && ev.getAction() == MotionEvent.ACTION_UP) {
            if (scroller.isFinished()) {
                //do your code
            }
        }
        return eventConsumed;
    }
}