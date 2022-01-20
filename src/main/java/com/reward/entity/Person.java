package com.reward.entity;

import javax.annotation.PostConstruct;

public class Person {
    public String name;
    public Integer age;

//    @PostConstruct
//    public void cc() {
//        System.out.println("cc方法执行了,PostConstruct()注解驱动的啦");
//    }

    public Person() {
        System.out.println("无参数构造函数");
    }

    public Person(String name, Integer age) {
        System.out.println("调用有参数构造方法...");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
