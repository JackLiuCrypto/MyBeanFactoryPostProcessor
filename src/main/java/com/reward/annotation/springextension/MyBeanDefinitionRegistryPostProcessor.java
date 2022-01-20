package com.reward.annotation.springextension;

import com.reward.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("自定义的Bean信息....");
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition("com.reward.entity.Person");
        beanDefinitionBuilder.addPropertyValue("name", "Jack一号");
        beanDefinitionBuilder.addPropertyValue("age", "18");

        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class).getBeanDefinition();
        beanDefinition.getPropertyValues().add("name", "Jack二号");
        beanDefinition.getPropertyValues().add("age", "28");


        registry.registerBeanDefinition("person_01", beanDefinitionBuilder.getBeanDefinition());
        registry.registerBeanDefinition("person_02", beanDefinition);
        //以下这一行证明registry可以覆盖同名的bean definition！
//        registry.registerBeanDefinition("person_01", beanDefinition);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}

