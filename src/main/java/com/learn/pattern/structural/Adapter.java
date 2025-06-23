package com.learn.pattern.structural;

/**
 * @Author: jphao
 * @Date: 2025/6/22 21:22
 * @Description:
 */
public class Adapter {

    public static void main(String[] args) {
        Payment aliPayAdapter = new AliPayAdapter();
        aliPayAdapter.pay(100);

        Payment wechatPayAdapter = new WechatPayAdapter();
        wechatPayAdapter.pay(100);

        aliPayAdapter.pay(100);
        wechatPayAdapter.pay(100);
    }
}

class AliPay {
    public void makePayment(double amount) {
        System.out.println("支付宝支付");
    }
}

class WechatPay {
    public void doPay(double amount) {
        System.out.println("微信支付");
    }
}

interface Payment {
    void pay(double amount);
}

class WechatPayAdapter implements Payment {
    private WechatPay wechatPay = new WechatPay();

    @Override
    public void pay(double amount) {
        wechatPay.doPay(amount);
    }
}

class AliPayAdapter implements Payment {
    private AliPay aliPay = new AliPay();

    @Override
    public void pay(double amount) {
        aliPay.makePayment(amount);
    }
}
