import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String context = br.readLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        boolean isTag = false;
        for (int i = 0; i < context.length(); i++) {
            char c = context.charAt(i);
            if (c == '<') {
                result.append(sb.reverse());
                sb.setLength(0);
                isTag = true;
                result.append(c);
            }

            else if (c == '>') {
                isTag = false;
                result.append(c);
            }

            else if (isTag) {
                result.append(c);
            }

            else if (c == ' ') {
                result.append(sb.reverse());
                sb.setLength(0);
                result.append(c);
            }

            else {
                sb.append(c);
            }
        }
        result.append(sb.reverse());
        System.out.println(result);
    }
}