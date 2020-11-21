package org.cdrgeek.basic;

/**
 * 内部类的学习
 */
public class InnerClassTest {
    private int number = 100;

    // 可以定义内部接口，并让内部类实现该接口
    public interface Print {
        void doPrint();
    }
    public class Inner implements Print{
        private int number = 200;

        @Override
        public void doPrint() {
            int number = 500;
            System.out.println("内部类方法局部变量: " + number);
            // 通过this访问内部类成员属性
            System.out.println("内部类成员属性：" + this.number);
            // 通过外部类名+this的方法访问外部类的成员属性
            System.out.println("外部类成员属性：" + InnerClassTest.this.number);
        }
    }

    public static void main(String args[]) {
        // 对于非静态内部类，需要先实例化外部类后，再通过实例对象.new创建内部类实例
        // 内部类类型，通过外部类名.内部类名指定
        InnerClassTest innerTest = new InnerClassTest();
        InnerClassTest.Inner inner = innerTest.new Inner();
        inner.doPrint();
    }
}
