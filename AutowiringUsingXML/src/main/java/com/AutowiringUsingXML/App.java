package com.AutowiringUsingXML;

import org.springframework.context.ApplicationContext;
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
        
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("config.xml");
        
        Emp emp = Acp.getBean("Emp1", Emp.class);
        System.out.println(emp);
    }
}
