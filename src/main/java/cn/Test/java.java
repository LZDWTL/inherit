package cn.Test;

import java.util.*;

public class java {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        String str = "this is a test, and that is also a test!";
        String arrstr[] = str.split(",|\\s|!");

        for (String s : arrstr) {

            if (!s.isEmpty()) {    //等价于s.length()!=0  但不能改成 s!=null ，
                /*
                    因为""是空串，是实例化之后的对象，有内存空间的，而null是没有实例化的对象，不占内存空间。
                    即 null不等于""
                 */
                if (map.get(s) != null) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }

        Set<String> strs = map.keySet();

        Iterator<String> it = strs.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next + ":" + map.get(next));
        }

        /*  等同于上面代码的效果
        Iterator it= strs.iterator();
        while(it.hasNext()){
            Object next=it.next();
            System.out.println(next+":"+map.get(next));
        }*/
    }
}
