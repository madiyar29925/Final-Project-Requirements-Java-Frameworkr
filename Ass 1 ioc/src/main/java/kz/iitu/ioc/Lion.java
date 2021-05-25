package kz.iitu.ioc;

public class Lion implements Animal {

    private String name;

    public Lion() {

    }

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lion.eat: " + this.toString());
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }
}
