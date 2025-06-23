package com.learn.pattern.creational;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.SerializationUtils;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: jphao
 * @Date: 2025/6/22 19:30
 * @Description: 原型模式
 */
@Getter
@Setter
public class Prototype implements Serializable {
    @Serial
    private static final long serialVersionUID = -9117634368134680458L;

    private String name;

    private int num;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return SerializationUtils.clone(this);
    }
}
