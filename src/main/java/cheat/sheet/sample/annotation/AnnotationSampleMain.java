package cheat.sheet.sample.annotation;

import cheat.sheet.sample.annotation.lomboks.ValueAnno;

public class AnnotationSampleMain {

    public static void lombok() {
        ValueAnno valueAnno = ValueAnno.of("123");
        System.out.println(valueAnno);
        System.out.println(valueAnno.getSomething());
    }

    public static void main(String[] args) {
        lombok();
    }

}
