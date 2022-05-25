package cheat.sheet.sample.classs;

public class ChildClass extends ClassSample {

    public String name;

    public ChildClass(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.toString() + " run " + this.age + " / " + this.name);
    }
}