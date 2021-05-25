package kz.iitu.annotationbasedconf;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Job {

    private String title;

//    @Required
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                '}';
    }
}
