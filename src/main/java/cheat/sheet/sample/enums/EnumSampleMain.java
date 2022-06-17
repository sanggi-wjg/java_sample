package cheat.sheet.sample.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

public class EnumSampleMain {

    public static void main(String[] args) {
        for (Something value : Something.values()) {
            System.out.println("value = " + value);
        }
    }
}


@Getter
enum Something {
    WHAT("What"),
    TEST("Test");

    private String value;

    Something(String value) {
        this.value = value;
    }
}