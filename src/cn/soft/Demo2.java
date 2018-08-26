package cn.soft;

import java.util.List;

/**
 * 轮询算法
 */
public class Demo2 {
    private static int i=0;
    public String get(List<String> list) {
        if(i==list.size()){
            i=0;
        }
        String s = list.get(i);
        i++;
        return s;
    }
}
