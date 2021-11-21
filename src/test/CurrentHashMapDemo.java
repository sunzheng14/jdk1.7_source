package test;

import java.util.concurrent.ConcurrentHashMap;

public class CurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();

        hashMap.put("","");
        int sshift = 0;
        int ssize = 1;
        //Segment的大小为大于等于concurrencyLevel的第一个2的n次方的数
        while (ssize < 16) {
            ++sshift;
            ssize <<= 1;
        }
        System.out.println(sshift);
        System.out.println(ssize);
    }
}
