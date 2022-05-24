package cheat.sheet.sample.classs;

public class ClassSample {

    public int age;

    public ClassSample() {
        this.age = 1;
    }

    public ClassSample(int age) {
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        // 9버전 이후로 소멸됨
        super.finalize();
    }

    public void run() {
        System.out.println(this.toString() + " run " + this.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 100) {
            throw new Exception("invalid age");
        }
        this.age = age;
    }
}

