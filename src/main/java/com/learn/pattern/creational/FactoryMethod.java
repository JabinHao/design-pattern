package com.learn.pattern.creational;

/**
 * @Author: jphao
 * @Date: 2025/6/22 18:35
 * @Description:
 */
public class FactoryMethod {
}
interface Season {
}

class Spring implements Season {
}

class Summer implements Season {
}

class Autumn implements Season {
}

class Winter implements Season {
}

interface SeasonFactory {
    Season createSeason();
}

class SpringFactory implements SeasonFactory {
    @Override
    public Season createSeason() {
        return new Spring();
    }
}

class SummerFactory implements SeasonFactory {
    @Override
    public Season createSeason() {
        return new Summer();
    }
}

class AutumnFactory implements SeasonFactory {
    @Override
    public Season createSeason() {
        return new Autumn();
    }
}

class WinterFactory implements SeasonFactory {
    @Override
    public Season createSeason() {
        return new Winter();
    }
}
