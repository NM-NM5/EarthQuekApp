package com.example.earthquake;

import java.util.ArrayList;

public class Quake extends ArrayList<Quake> {
    private String mMag;
    private String mName;
    private String mDate;

    public Quake (String mag,String name, String date){
        mMag = mag;
        mName = name;
        mDate = date;
    }

    public String getDate() {
        return mDate;
    }

    public String getMag() {
        return mMag;
    }

    public String getName() {
        return mName;
    }
}
