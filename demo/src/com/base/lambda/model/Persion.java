package src.com.base.lambda.model;

public class Persion {
    String name;
    String age;

    public Persion() {
    }

    public Persion(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
