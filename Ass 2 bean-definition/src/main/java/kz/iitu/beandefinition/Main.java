package kz.iitu.beandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        HelloMike child = context.getBean("child", HelloMike.class);
//        System.out.println(child);

//        context.getBean("userService", )

        ((ClassPathXmlApplicationContext) context).close();

    }
}
