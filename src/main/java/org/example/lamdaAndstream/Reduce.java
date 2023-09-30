package org.example.lamdaAndstream;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {


        //reduce는 최종연산자라 한 번 사용한 reduce는 닫혀 비교시 새로운 객체를 만들어 사용해야함.
        Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10); // 10개의 숫자를 정의합니다.
        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10); // 10개의 숫자를 정의합니다.
        Optional<Integer> NonparallelSum = numbers1.parallel().reduce((total, number) -> total + number);
        Optional<Integer> parallesum = numbers2.parallel().reduce((total, number) -> total + number);
        // reduce는 인자로 BinaryOperator 객체를 받습니다.
        // BinaryOperator 두 개의 T타입의 인자를 받고 T타입 객체를 return 하는 함수형 인터페이스입니다.
        //total 이라는 초기 값을 받고(total == 0) 나머지 number들을 더 해주는 함수를 구현합니다.
        parallesum.ifPresent(System.out::println);
        NonparallelSum.ifPresent(System.out::println);
        //reduce는 parallel()과 함께 연산을 병렬처리합니다.

        //하지만 병렬연산으로 인해 원래 기대했던 값이 변할 수 있는 경우가 있어 사용시 주의해야합니다.
        //ex
        Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10);
        Stream<Integer> numbers4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10);
        Optional<Integer> parallelsubtraction = Optional.of(numbers3.parallel().reduce(0, (total, subtraction) -> total - subtraction));
        Optional<Integer> nonparallelsubtraction = Optional.of(numbers4.reduce(0, (total, subtraction) -> total - subtraction));
        parallelsubtraction.ifPresent(System.out::println); // 기대 값 -55 but 결과값 -5
        nonparallelsubtraction.ifPresent(System.out::println); // 기대 값 -55 but 결과값 -55

        Stream<Integer> parallandSequentially = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = parallandSequentially .reduce(0,
                (total, n) -> total - n,
                (total1, total2) -> total1 + total2); //추가 이렇게하면 다음연산에 영향을 미쳐 병렬연산에서 순차적으로 실행해 원하던 기대값을 얻을 수 있다.
        System.out.println("sum: " + sum);

        //출처 https://codechacha.com/ko/java8-stream-reduction/#3-reduce의-병렬-처리
    }


}
