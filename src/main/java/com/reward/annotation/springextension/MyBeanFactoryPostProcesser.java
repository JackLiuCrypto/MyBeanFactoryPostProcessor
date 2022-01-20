package com.reward.annotation.springextension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyBeanFactoryPostProcesser implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition person_01 = beanFactory.getBeanDefinition("person_01");
        person_01.getPropertyValues().add("name", "Jack一号 新名字");
        person_01.setScope(BeanDefinition.SCOPE_SINGLETON);
        System.out.println("BeanFactoryPostProcessor的postProcessBeanFactory方法正在调用...");
    }
}

