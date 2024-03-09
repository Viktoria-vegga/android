package com.example.mitrofanovaviktoria;

import java.util.ArrayList;
import java.util.ListIterator;

public class Constants {
    static final public String MY_TAG = "MY_TAG";
    static final public String REQUEST_KEY = "REQUEST_KEY";
    static final public String BUNDLE_KEY = "REQUEST_KEY";
    static final public String CHILD_REQUEST_KEY = "CHILD_REQUEST_KEY";

    public static ArrayList<String> Items() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            list.add("элемент " + (i + 1));
        }
        return list;
    }
}
