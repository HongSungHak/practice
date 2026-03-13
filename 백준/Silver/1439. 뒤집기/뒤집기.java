import java.io.*;



public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int zeroGroup = 0;
        int oneGroup = 0;
        if (arr[0] == '0') zeroGroup++;
        else oneGroup++;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                if (arr[i] == '0') zeroGroup++;
                else oneGroup++;
            }
        }
        int min = Math.min(zeroGroup, oneGroup);
        System.out.println(min);

    }
}
