package com.grq.spring.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DITest {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("DITest.xml"));
        User user = (User) factory.getBean("qixiaoxia");
        System.out.println(user);
    }
}
