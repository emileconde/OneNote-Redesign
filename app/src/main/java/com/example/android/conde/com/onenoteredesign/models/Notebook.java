package com.example.android.conde.com.onenoteredesign.models;

import android.graphics.drawable.Drawable;

public class Notebook {

    private Drawable icon;
    private String title;

    public Notebook(Drawable icon, String name) {
        this.icon = icon;
        this.title = name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }
}
