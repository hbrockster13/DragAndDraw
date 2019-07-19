package com.example.draganddraw.models;

import android.graphics.PointF;

public class Box
{
    private PointF mOrgin;
    private PointF mCurrent;

    public Box(PointF orgin)
    {
        mOrgin = orgin;
        mCurrent = orgin;
    }

    public PointF getOrgin()
    {
        return mOrgin;
    }

    public PointF getCurrent()
    {
        return mCurrent;
    }

    public void setCurrent(PointF mCurrent)
    {
        this.mCurrent = mCurrent;
    }
}
