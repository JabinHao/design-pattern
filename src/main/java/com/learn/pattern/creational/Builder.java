package com.learn.pattern.creational;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: jphao
 * @Date: 2025/6/22 19:23
 * @Description:
 */
public class Builder {
}

@Getter
@Setter
class Person {
    private int age;

    private String gender;

    private String name;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    private Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public static class PersonBuilder {
        private int age;

        private String gender;

        private String name;

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Person build() {
            return new Person(age, gender, name);
        }
    }
}
