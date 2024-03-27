package com.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("Config.xml");
        Student st = Acp.getBean(Student.class); 
        System.out.println(st);
    }
}
