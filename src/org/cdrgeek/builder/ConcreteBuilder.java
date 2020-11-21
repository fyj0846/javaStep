package org.cdrgeek.builder;

import org.cdrgeek.prototype.ConcretePrototype;

/**
 * 使用静态内部类方法实现建造者模式
 */
public class ConcreteBuilder {
    private String name;
    private String ppt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    @Override
    public String toString() {
        return "ConcreteBuilder{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                '}';
    }

    /**
     * 静态内部类实现复杂的构建逻辑
     * 将构建逻辑屏蔽在内部类中
     */
    public static class Builder {
        private ConcreteBuilder demo = new ConcreteBuilder();

        // 返回内部构造内以实现链式调用
        public Builder addName(String name) {
            demo.setName(name);
            return this;
        }

        public Builder addPpt(String ppt) {
            demo.setPpt(ppt);
            return this;
        }

        public ConcreteBuilder builder() {
            return demo;
        }
    }
}
