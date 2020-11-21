package org.cdrgeek.basic;

/**
 * 静态内部类的学习
 */
public class StaticInnerClassTest {

    public static class StaticInner {
        private static int number = 200;

        public static void doPrint() {
            System.out.println(number);
        }
    }

    public static void main(String args[]) {
        // 静态内部类，不需要先实例化外部类就可以直接实例化内部类
        StaticInner inner  = new StaticInnerClassTest.StaticInner();
        inner.doPrint();

        System.out.println("直接调用内部类静态方法：");
        StaticInnerClassTest.StaticInner.doPrint();
    }
}
