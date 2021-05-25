package kz.iitu.annotationbasedconf;

import org.springframework.context.annotation.*;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.iitu.annotationbasedconf")
@PropertySource("application.properties")
//@Import()
public class SpringConfigration {

    @Bean
    public List<ProgrammingLanguage> languageList() {
        List<ProgrammingLanguage> languageList = new ArrayList<>();
        languageList.add(new ProgrammingLanguage("C++"));
        languageList.add(new ProgrammingLanguage("Java"));
        languageList.add(new ProgrammingLanguage("Python"));

        return languageList;
    }

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.Driver");
//        dataSource.setUrl("");
//        dataSource.setUsername("");
//        dataSource.setPassword("asdasd");
//
//        return dataSource;
//    }

//    @Bean
//    public JdbcTemplate jdbcTemplate() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
//
//        return jdbcTemplate;
//    }
}
