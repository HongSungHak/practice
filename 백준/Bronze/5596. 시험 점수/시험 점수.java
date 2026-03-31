import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int minkook = 0;
        for (int i = 0; i < 4; i++) {
            minkook += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int manse = 0;
        for (int i = 0; i < 4; i++) {
            manse += Integer.parseInt(st.nextToken());
        }
        if (minkook == manse) {
            System.out.println(minkook);
            return;
        } 
        System.out.println(Math.max(minkook, manse));
    }
}