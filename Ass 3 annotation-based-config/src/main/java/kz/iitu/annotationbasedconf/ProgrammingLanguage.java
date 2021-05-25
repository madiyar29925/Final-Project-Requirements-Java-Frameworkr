package kz.iitu.annotationbasedconf;

import org.springframework.stereotype.Component;

@Component("language")
public class ProgrammingLanguage {

    private String name;

    public ProgrammingLanguage() {
        this.name="Java (default)";
    }

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                '}';
    }
}
