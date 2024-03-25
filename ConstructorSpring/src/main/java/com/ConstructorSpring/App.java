package com.ConstructorSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("config.xml");
        Person p = (Person) Acp.getBean("id1");
        System.out.println(p);
    }
}
