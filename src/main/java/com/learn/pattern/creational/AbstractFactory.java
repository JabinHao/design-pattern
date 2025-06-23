package com.learn.pattern.creational;

/**
 * @Author: jphao
 * @Date: 2025/6/22 18:34
 * @Description:
 */
public class AbstractFactory {
}

// 抽象产品
interface Button {
    void click();
}

interface TextField {
    void setText(String text);
}

// 具体产品 - Windows风格
class WindowsButton implements Button {
    public void click() { System.out.println("Windows按钮被点击"); }
}

class WindowsTextField implements TextField {
    public void setText(String text) { System.out.println("Windows文本框: " + text); }
}

// 具体产品 - Mac风格
class MacButton implements Button {
    public void click() { System.out.println("Mac按钮被点击"); }
}

class MacTextField implements TextField {
    public void setText(String text) { System.out.println("Mac文本框: " + text); }
}

// 抽象工厂
abstract class UIFactory {
    abstract Button createButton();
    abstract TextField createTextField();
}

// 具体工厂
class WindowsFactory extends UIFactory {
    Button createButton() { return new WindowsButton(); }
    TextField createTextField() { return new WindowsTextField(); }
}

class MacFactory extends UIFactory {
    Button createButton() { return new MacButton(); }
    TextField createTextField() { return new MacTextField(); }
}
