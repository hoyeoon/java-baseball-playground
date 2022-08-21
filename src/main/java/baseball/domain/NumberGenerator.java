package baseball.domain;

import java.util.*;

public class NumberGenerator {
    public List<Integer> createRandomNumbers() {
        Set<Integer> set = new HashSet<>();

        while (set.size() < 3) {
            Double d = Math.random() * 9 + 1;
            set.add(d.intValue());
        }
        return new ArrayList<>(set);
    }
}
