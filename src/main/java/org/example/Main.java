package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * StringBuffer의 비교
         * StringBuffer는 equlas()가 오버라이딩 되어 있지 않다.(주소비교)
         * StringBuffer을 String으로 변환 후 equals()로 비교해야 한다.
         */
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        String s = sb.toString();
        String s2 = sb2.toString();
        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));
        System.out.println(s.equals(s2));


//        sb.delete() 삭제
//        sb.insert()삽입
//        StringBuffer sb2 = sb.append("ZZ");




    }
}