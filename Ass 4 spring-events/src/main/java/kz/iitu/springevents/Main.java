package kz.iitu.springevents;

import kz.iitu.springevents.config.SpringConfiguration;
import kz.iitu.springevents.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        context.start();
//        context.stop();
//        context.close();
        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId(1L);
        user.setName("Test create");
        user.setAge(18);
        userDao.create(user);
    }
}
