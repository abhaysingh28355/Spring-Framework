package com.implementingLifeCycleMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        
        Mango mag = (Mango) ctx.getBean("id1");
        ctx.registerShutdownHook();
        
        System.out.println(mag);
    }
}
