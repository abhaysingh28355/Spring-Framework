package com.Springcorefirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext  Acp= new ClassPathXmlApplicationContext("firstxml.xml");
        Student st = (Student) Acp.getBean("id1"); 
//        System.out.println(st);
        st.display();
    }
}
