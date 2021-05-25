package kz.iitu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        Tiger tiger = new Tiger();
//        tiger.eat();

//        Lion lion = new Lion();
//        lion.eat();

//        Animal animal = new Lion();
//        animal.eat();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Tiger tiger = context.getBean("tiger", Tiger.class);
//        tiger.eat();
//        System.out.println("tiger = " + tiger);

//        Animal animal = context.getBean("animal", Animal.class);
//        animal.eat();
//
        System.out.println(context.getBean("person", Person.class).toString());

    }
}
