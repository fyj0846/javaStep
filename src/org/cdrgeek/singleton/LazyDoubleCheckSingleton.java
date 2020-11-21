package org.cdrgeek.singleton;

/**
 * 单例模式
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton() {
        // 此处可以实现业务逻辑
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            // 通过synchronized设置同步方法块
            // 锁：LazyDoubleCheckSingleton.class对象
            synchronized (LazyDoubleCheckSingleton.class) {
                // 获取锁，但可能上一个持有锁的线程已经完成了初始化，因此此时还需要再做一次判断
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
