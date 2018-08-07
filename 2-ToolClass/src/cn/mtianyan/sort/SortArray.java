package cn.mtianyan.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        Character [] charArray = new Character[]{'m','t','i','a','n','y','a','n'};
        List<Character> list = Arrays.asList(charArray);

        System.out.println("====Character排序前====");
        for (Character character:list) {
            System.out.print(character+" ");
        }



        System.out.println();
        System.out.println("====Character正序排序后====");
        Collections.sort(list);
        for (Character character:list) {
            System.out.print(character+" ");
        }

        System.out.println();
        System.out.println("====Character逆序排序后====");
        Collections.sort(list,Collections.reverseOrder());
        for (Character character:list) {
            System.out.print(character+" ");
        }

        String [] stringArray = new String[]{"yes","ha","mtianyan","ab"};
        System.out.println();
        List<String> list1 = Arrays.asList(stringArray);
        System.out.println("====String排序前====");
        for (String string:list1) {
            System.out.print(string+" ");
        }
        System.out.println();
        Collections.sort(list1);
        System.out.println("====String正序排序后====");
        for (String string:list1) {
            System.out.print(string+" ");
        }
        Comparator cmp1 = Collections.reverseOrder();
        Collections.sort(list1,cmp1);
        System.out.println();
        System.out.println("====String逆序排序后====");
        for (String string:list1) {
            System.out.print(string+" ");
        }

        Integer[] intArray = new Integer[]{8,6,3,4,7,5,1};
        List<Integer> list2 = Arrays.asList(intArray);
        System.out.println();
        System.out.println("====Integer排序前====");
        for (Integer integer:list2) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("====Integer正序排序后====");
        Collections.sort(list2);
        for (Integer integer:list2) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("====Integer逆序排序后====");
        Collections.sort(list2,Collections.reverseOrder());
        for (Integer integer:list2) {
            System.out.print(integer+" ");
        }
    }
}
