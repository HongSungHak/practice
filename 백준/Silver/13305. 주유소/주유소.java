import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distance = new long[N - 1];
        long[] price = new long[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < price.length; i++) {
            price[i] = Integer.parseInt(st2.nextToken());
        }

        long totalPrice = distance[0] * price[0];
        long minPrice = price[0];



        for (int i = 1; i < N-1; i++) {
            minPrice = Math.min(minPrice, price[i]);
            totalPrice += distance[i] * minPrice;
        }
        System.out.println(totalPrice);
    }
}