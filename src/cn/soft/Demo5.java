package cn.soft;

import java.util.ArrayList;
import java.util.List;

/**
 * 加权轮询
 */
public class Demo5 {
    //包含权重的地址
    private static List<String> strings=new ArrayList<>();
    private static volatile boolean init=false;
    private static int i=0;

    public String get(List<String> list) {
        //只有第一次被初始化
      if (!init){
          synchronized (Demo5.class){
              if(!init){
                  init(list);
                  init=true;
              }
          }
      }

        if(i==strings.size()){
            i=0;
        }
        return strings.get(i++);
    }

    public void init(List<String> list){
        for (String s:list){
            int weight=0;
            for (int i = 0; i <weight ; i++) {
                strings.add(s);
            }
        }
    }

}
