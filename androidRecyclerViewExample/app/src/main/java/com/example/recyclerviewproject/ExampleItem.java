package com.example.recyclerviewproject;

public class ExampleItem {
    private int mImageResource;
    private String mtext1;
    private String mtext2;


    public ExampleItem(int ImageResource, String text1, String text2) {
        mImageResource = ImageResource;
        mtext1 = text1;
        mtext2 = text2;
    }

    public void changeText(String text) {
        mtext1 = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getMtext1() {
        return mtext1;
    }

    public String getMtext2() {
        return mtext2;
    }
}
