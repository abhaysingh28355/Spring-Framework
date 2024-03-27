package com.StandalongCollection;

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
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("Config.xml");
        Person st = Acp.getBean("person1",Person.class); 
        System.out.println(st);
        System.out.println(st.getFriends().getClass().getName());
        System.out.println("---------------------------------------------------------");
        System.out.println(st.getFeeStructure());
    }
}
