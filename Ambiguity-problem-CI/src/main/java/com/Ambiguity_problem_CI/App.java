package com.Ambiguity_problem_CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("config.xml");
        Addition ad = (Addition) Acp.getBean("id1");
         ad.doSum();
    }
}
