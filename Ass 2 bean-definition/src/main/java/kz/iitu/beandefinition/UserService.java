package kz.iitu.beandefinition;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService {
//        implements InitializingBean, DisposableBean {

    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        this.init();
//    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @PostConstruct
    public void init() {
        this.createDbConnection();
    }

    public void createDbConnection() {
        // init connection
        System.out.println("UserService.createDbConnection");
    }

//    @Override
    @PreDestroy
    public void destroy() {
        this.closeConnections();
    }

    public void closeConnections() {
        System.out.println("UserService.closeConnections");
    }
}
