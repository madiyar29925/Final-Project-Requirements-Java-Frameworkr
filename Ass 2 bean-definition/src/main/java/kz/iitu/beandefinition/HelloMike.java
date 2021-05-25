package kz.iitu.beandefinition;

public class HelloMike {

    private Integer id;
    private String message1;
    private String message2;
    private String message3;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    @Override
    public String toString() {
        return "HelloMike{" +
                "id=" + id +
                ", message1='" + message1 + '\'' +
                ", message2='" + message2 + '\'' +
                ", message3='" + message3 + '\'' +
                '}';
    }
}
