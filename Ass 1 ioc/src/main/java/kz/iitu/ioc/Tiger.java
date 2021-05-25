package kz.iitu.ioc;

public class Tiger implements Animal {

    private String name;
    private Integer age;

    public Tiger() {
        System.out.println("Tiger default constructor");
    }

    public Tiger(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Tiger full constructor");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Tiger.setName");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("Tiger.setAge");
    }

    @Override
    public void eat() {
        System.out.println("Tiger.eat: " + this);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
