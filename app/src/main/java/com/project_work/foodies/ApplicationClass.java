package com.project_work.foodies;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Item> item;

    @Override
    public void onCreate() {
        super.onCreate();
        item=new ArrayList<Item>();
        item.add(new Item("Samosa","Samosa","Edible","10","Panner,Aloo"));
        item.add(new Item("Bread","Bread","Edible","5","Loaf"));
    }

}
