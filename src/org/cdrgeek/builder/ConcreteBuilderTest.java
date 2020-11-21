package org.cdrgeek.builder;

public class ConcreteBuilderTest {
   public static void main(String args[]) {
       // 通过链式调用屏蔽复杂的构建逻辑
       ConcreteBuilder test = new ConcreteBuilder.Builder()
               .addName("test")
               .addPpt("ppt")
               .builder();

       System.out.println(test);
   }
}
