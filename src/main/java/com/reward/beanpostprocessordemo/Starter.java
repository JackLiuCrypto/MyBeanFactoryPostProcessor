package com.reward.beanpostprocessordemo;


import com.reward.annotation.config.ModuleConfig;
import com.reward.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Map;
public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(ModuleConfig.class);
        Map<String, Person> beansOfType = annotation.getBeansOfType(Person.class);
        for (String s : beansOfType.keySet()) {
            System.out.println("名字是：" + s);
            System.out.println(beansOfType.get(s).toString());
        }




    }
}
