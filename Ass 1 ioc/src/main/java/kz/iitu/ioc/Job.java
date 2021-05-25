package kz.iitu.ioc;

public class Job {

    private String title;
    private String organization;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}
