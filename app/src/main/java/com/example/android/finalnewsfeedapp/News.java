package com.example.android.finalnewsfeedapp;



public class News {
    private String mTitle;
    private String mSection;
    private String mUrl;
    private String mDate;

    public News(String mTitle, String mSection, String mUrl, String mDate) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mUrl = mUrl;
        this.mDate = mDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getDate() {
        return mDate;
    }
}
