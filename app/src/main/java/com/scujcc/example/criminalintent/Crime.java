package com.scujcc.example.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by scujcc on 17-11-2.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private String mIntroduce;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID uuid) {
        mId = uuid;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public void setSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    public String getmIntroduce() {
        return mIntroduce;
    }

    public void setmIntroduce(String mIntroduce) {
        this.mIntroduce = mIntroduce;
    }
}
