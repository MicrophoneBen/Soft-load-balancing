package cn.soft;

import java.util.List;

/**
 * ip地址hash
 */
public class Demo3 {

    public String get(List<String> list) {
       String ip="";
       int hash = hash(ip);
       return list.get(hash%list.size());
    }


    /**
     * hash函数
     * @param ip
     * @return
     */
    public int hash(String ip){
        return 0;
    }
}
