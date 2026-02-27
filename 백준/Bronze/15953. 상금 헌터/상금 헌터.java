import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T --> 0) {
            int prizeMoney = 0;
            st = new StringTokenizer(br.readLine());
            int firstCom = Integer.parseInt(st.nextToken());
            int secondCom = Integer.parseInt(st.nextToken());
            if (firstCom == 1) {
                prizeMoney += 5000000;
            } else if (firstCom == 2 || firstCom == 3) {
                prizeMoney += 3000000;
            } else if (firstCom >= 4 && firstCom <= 6) {
                prizeMoney += 2000000;
            } else if (firstCom >= 7 && firstCom <= 10) {
                prizeMoney += 500000;
            } else if (firstCom >= 11 && firstCom <= 15) {
                prizeMoney += 300000;
            } else if (firstCom >= 16 && firstCom <= 21) {
                prizeMoney += 100000;
            }

            if (secondCom == 1) {
                prizeMoney += 5120000;
            } else if (secondCom == 2 || secondCom == 3) {
                prizeMoney += 2560000;
            } else if (secondCom >= 4 && secondCom <= 7) {
                prizeMoney += 1280000;
            } else if (secondCom >= 8 && secondCom <= 15) {
                prizeMoney += 640000;
            } else if (secondCom >= 16 && secondCom <= 31)  {
                prizeMoney += 320000;
            }

            System.out.println(prizeMoney);
        }
    }
}