package com.learn.pattern.creational;

/**
 * @Author: jphao
 * @Date: 2025/6/22 18:35
 * @Description:
 */
public class SimpleFactory {
}

interface Season1 {
}

class Spring1 implements Season1 {
}

class Summer1 implements Season1 {
}

class Autumn1 implements Season1 {
}

class Winter1 implements Season1 {
}

class SeasonFactory1 {
    public static Season1 createSeason(String feature) {
        return switch (feature) {
            case "warm" -> new Spring1();
            case "hot" -> new Summer1();
            case "cool" -> new Autumn1();
            case "cold" -> new Winter1();
            default -> throw new IllegalArgumentException("Invalid season feature: " + feature);
        };
    }
}
