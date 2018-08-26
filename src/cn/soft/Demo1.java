package cn.soft;

import java.util.List;
import java.util.Random;

/**
 * 随机算法
 */
public class Demo1 {
    private static final Random RANDOM = new Random();

    public String get(List<String> list) {
        int max = list.size();
        int i = RANDOM.nextInt(max);
        return list.get(i);
    }
}
