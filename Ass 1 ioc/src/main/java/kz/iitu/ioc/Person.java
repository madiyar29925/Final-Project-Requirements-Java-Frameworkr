package kz.iitu.ioc;

public class Person {

    private String name;
    private Job job;

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }
}
