package kz.iitu.springevents.dao;

import kz.iitu.springevents.User;
import kz.iitu.springevents.event.UserCreateEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    public void create(User user) {
        System.out.println("UserDao.create");
        System.out.println("user = " + user);

        //TODO create user in db

        this.eventPublisher.publishEvent(new UserCreateEvent(this, user));
    }

    public void update(Long id, User user) {
        System.out.println("UserDao.update");
    }

    public void delete(Long id) {
        System.out.println("UserDao.delete id: " + id);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
