package cheat.sheet.sample.classs;

public class AbstractChildClass extends AbstractClass {

    public AbstractChildClass(String name) {
        super(name);
    }

    @Override
    public void func2() {
        System.out.println("func2 " + this.name);
    }
}
