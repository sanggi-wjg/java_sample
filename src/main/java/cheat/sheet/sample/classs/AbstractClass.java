package cheat.sheet.sample.classs;

public abstract class AbstractClass {

    public String name;

    public AbstractClass(String name) {
        this.name = name;
    }

    public void func1() {
        System.out.println(this.name);
    }

    public abstract void func2();

}
