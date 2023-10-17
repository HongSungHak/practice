package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GapMarkUp2 {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string);
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
