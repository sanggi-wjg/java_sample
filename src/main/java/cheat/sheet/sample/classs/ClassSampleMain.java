package cheat.sheet.sample.classs;

public class ClassSampleMain {

    public static void one() {
        ClassSample sample_1 = new ClassSample();
        sample_1.run();

        ClassSample sample_2 = new ClassSample(10);
        sample_2.run();

        ChildClass child_1 = new ChildClass(10, "Snow");
        child_1.run();
    }

    public static void two() {
        AbstractChildClass abc = new AbstractChildClass("Snow");
        abc.func1();
        abc.func2();
    }

    public static void main(String[] args) {
        two();

    }

}
