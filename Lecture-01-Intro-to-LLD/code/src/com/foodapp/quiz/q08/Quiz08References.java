package com.foodapp.quiz.q08;

// Frame 08 PREDICT. Expected output: 200.0
public class Quiz08References {
    public static void main(String[] args) {
        MenuItem a = new MenuItem();
        a.price = 100;
        MenuItem b = a;
        b.price = 200;
        System.out.println(a.price);
    }
}
