package kz.iitu.annotationbasedconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Value("${developer.name}")
    private String name;
    private Job job;
//    @Autowired
    private ProgrammingLanguage language;

    public Developer() {
    }

    @Autowired
    public Developer(Job job, ProgrammingLanguage language) {
        this.job = job;
        this.language = language;
        System.out.println("Developer.Developer constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Autowired
//    @Qualifier("ceo")
    public void setJob(Job job) {
        this.job = job;
    }

    public void setLanguage(ProgrammingLanguage language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", job=" + job +
                ", language=" + language +
                '}';
    }
}
