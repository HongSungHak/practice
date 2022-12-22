package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String animals = "dog, cat, bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr);
        System.out.println("str = " + str); //join메서드를 사용하여 나누기

        //숫자를 문자열로 바꾸는 방법
        int i = 100;
        String str1 = i + ""; //속도가 느림
        String str2 = String.valueOf(i); //valueOf 메서드를 사용해서 속도가 빠름

        //문자열을 숫자로 바꾸는 방법
        int i2 = Integer.parseInt("100"); //valueOf로 통일시킴
        int i3 = Integer.valueOf("100");
        Integer i4 = Integer.valueOf("100"); //valueOf은 참조형으로 반환함
    }
}