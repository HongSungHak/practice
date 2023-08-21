package org.example.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10); // 10개의 숫자를 정의합니다.
        Optional<Integer> sum = numbers.reduce((total, number) -> total + number);
        // reduce는 인자로 BinaryOperator 객체를 받습니다.
        // BinaryOperator 두 개의 T타입의 인자를 받고 T타입 객체를 return 하는 함수형 인터페이스입니다.
        //total 이라는 초기 값을 받고(total == 0) 나머지 number들을 더 해주는 함수를 구현합니다.
        sum.ifPresent(System.out::println);
    }


}
