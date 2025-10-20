import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, List<String>> teamToMembers = new HashMap<>();
        Map<String, String> memberToTeam = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String teamName = br.readLine().trim();
            int cnt = Integer.parseInt(br.readLine().trim());
            List<String> members = new ArrayList<>();
            for (int j = 0; j < cnt; j++) {
                String member = br.readLine().trim();
                members.add(member);
                memberToTeam.put(member, teamName);
            }
            Collections.sort(members);
            teamToMembers.put(teamName, members);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String q = br.readLine().trim();
            int queryType = Integer.parseInt(br.readLine().trim());
            if (queryType == 0) {
                List<String> list = teamToMembers.get(q);
                for (String m : list) {
                    sb.append(m).append("\n");
                }
            } else {
                sb.append(memberToTeam.get(q)).append("\n");
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}