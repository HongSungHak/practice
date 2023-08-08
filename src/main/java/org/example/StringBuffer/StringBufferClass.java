package org.example.StringBuffer;


import java.util.List;
import java.util.ListIterator;




public class StringBufferClass {
    public static void main(String[] args) {

        int sum = 0;

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        ListIterator<Integer> integerListIterator = integers.listIterator();
        while (integerListIterator.hasNext()) {
            sum += integerListIterator.next();
            System.out.println(sum);
        }
    }
}
