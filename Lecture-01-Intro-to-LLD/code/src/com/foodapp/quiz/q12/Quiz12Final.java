package com.foodapp.quiz.q12;

import java.util.ArrayList;
import java.util.List;

// Frame 12 PREDICT. Line A compiles, line B does not.
// Uncomment line B to show the compile error live.
public class Quiz12Final {
    public static void main(String[] args) {
        final List<String> items =
                new ArrayList<String>();

        items.add("Dosa");                      // A
        // items = new ArrayList<String>();     // B

        System.out.println(items);
    }
}
