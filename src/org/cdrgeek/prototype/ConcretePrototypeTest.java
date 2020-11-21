package org.cdrgeek.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototypeTest {
    public static void main(String args[]) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(33);
        prototype.setName("qiujian");

        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);

        // 浅拷贝
        // ConcretePrototype cloneType = prototype.clone();

        // 深拷贝
        // 注意：原型模式应避免破坏单例模式的唯一实例特性
        ConcretePrototype cloneType = prototype.deepClone();

        cloneType.getHobbies().add("技术控");
        System.out.println(prototype);
        System.out.println(cloneType);
    }
}
