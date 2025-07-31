import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ItemDiscountCalculator {
    private final int[] prices;

    public ItemDiscountCalculator(int[] prices) {
        this.prices = prices;
    }

    public int calculateTotalPrice() {
        Arrays.sort(prices);
        int totalPrice = 0;
        int itemCount = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            itemCount++;
            if (itemCount % 3 != 0) {
                totalPrice += prices[i];
            }
        }

        return totalPrice;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        ItemDiscountCalculator calculator = new ItemDiscountCalculator(prices);
        int totalPrice = calculator.calculateTotalPrice();

        System.out.println(totalPrice);
    }
}
