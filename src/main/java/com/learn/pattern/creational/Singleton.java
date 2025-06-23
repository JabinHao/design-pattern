package com.learn.pattern.creational;

/**
 * @Author: jphao
 * @Date: 2025/6/22 18:51
 * @Description: 单例模式
 */
public class Singleton {
}

/**
 * 饿汉
 */
class HungryMan {
    private static final HungryMan instance = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getInstance() {
        return instance;
    }
}

/**
 * 懒汉
 */
class LazyMan {
    private LazyMan() {}

    private static volatile LazyMan instance = null;

    public LazyMan getInstance() {
        if (instance == null) {
            synchronized (LazyMan.class) {
                if (instance == null) {
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类
 */

class StaticInnerClass {
    private StaticInnerClass() {}

    private static class Holder {
        private static StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }
}

/**
 * 枚举
 */
enum  SingletonEnum {
    INSTANCE;
}
