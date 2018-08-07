package cn.mtianyan.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatTwoTest {
    public static void main(String[] args) {
        List<CatTwo> list = new ArrayList<>();
        // 定义宠物猫对象
        CatTwo huahua = new CatTwo("aa", 12, "英国短毛猫");
        CatTwo fanfan = new CatTwo("bb", 3, "中华田园猫");
        CatTwo huahua02 = new CatTwo("cc", 2, "英国短毛猫");
        list.add(huahua);
        list.add(fanfan);
        list.add(huahua02);
        System.out.println("排序前宠物猫信息");
        for (CatTwo cat: list) {
            System.out.println(cat);
        }
        Comparator<CatTwo> comparator = new Comparator<CatTwo>() {
            @Override
            public int compare(CatTwo o1, CatTwo o2) {
//                return o1.getMonth() - o2.getMonth();
                return o2.getName().compareTo(o1.getName());
            }
        };

        Collections.sort(list,comparator);
        System.out.println("排序后宠物猫信息(按名字从大到小)");
        for (CatTwo cat: list) {
            System.out.println(cat);
        }
    }
}
