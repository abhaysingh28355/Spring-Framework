package com.SpringExpressionLangaugeSPEL;

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
        Demo st = Acp.getBean(Demo.class); 
        System.out.println(st);
    }
}
