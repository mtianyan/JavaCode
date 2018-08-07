package cn.mtianyan.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest{
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        // 定义宠物猫对象
        Cat huahua = new Cat("aa", 12, "英国短毛猫");
        Cat fanfan = new Cat("bb", 3, "中华田园猫");
        Cat huahua02 = new Cat("cc", 2, "英国短毛猫");
        list.add(huahua);
        list.add(fanfan);
        list.add(huahua02);
        System.out.println("排序前宠物猫信息");
        for (Cat cat: list) {
            System.out.println(cat);
        }

        // 执行排序操作
        Collections.sort(list); // Cat必须实现Comparable接口，并实现其方法
        System.out.println("按名字从大到小排序之后宠物猫信息");
        for (Cat cat: list) {
            System.out.println(cat);
        }
    }
}

