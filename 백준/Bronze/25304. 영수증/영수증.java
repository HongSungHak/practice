import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine());
        int goodsCount = Integer.parseInt(br.readLine());
        int totalPrice = 0;
        StringTokenizer st;
        for (int i = 0; i < goodsCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());
            totalPrice += price * amount;
        }
        System.out.println(totalAmount == totalPrice ? "Yes" : "No");
    }
}