package kz.iitu.annotationbasedconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
//        context.scan("kz.iitu.annotationbasedconf");
//        context.refresh();


        Developer developer = context.getBean("developer", Developer.class);
//
        System.out.println(developer);

        List<ProgrammingLanguage> languageList = context.getBean("languageList", List.class);
        System.out.println("languageList = " + languageList);
    }
}
