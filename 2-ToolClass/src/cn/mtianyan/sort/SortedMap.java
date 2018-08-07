package cn.mtianyan.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SortedMap {
    public static void main(String[] args) {

        Set<String> set =  new HashSet<>();
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("aaa");
        set.add("bbb");


        for (String string:set){
            System.out.println(string);
        }
        System.out.println("=============");
        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add("ccc");
        concurrentSkipListSet.add("ddd");
        concurrentSkipListSet.add("eee");
        concurrentSkipListSet.add("aaa");
        concurrentSkipListSet.add("bbb");


        for (String string:concurrentSkipListSet) {
            System.out.println(string);
        }
    }
}
