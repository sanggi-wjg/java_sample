package cheat.sheet.sample.string;

import java.text.MessageFormat;

public class StringSample {

    public void basic_1() {
        // 속도는 StringBuilder 가 빠른데 안전성은 StringBuffer 가 더 좋음.

        // StringBuffer 는 Multi-Thread 환경에서 안정하다는 장점.
        // StringBuilder 는 성능이 더 좋은 장점
        /*
         * StringBuffer 는 객체가 한번만 생산되고
         * String 은 Concat 이 있을 때마다 새로운 String 객체가 생성.
         * String 은 기본적으로 immutable 이다. trim, toUpperCase 듣 메소드는 새로운 객체를 생성해서 반환하는 것.
         *
         * 그러면... StringBuffer 가 무조건 좋을까?
         * StringBuffer 는 String 보다 무거운 자료형이다. manipulate 가 많을 시 좋다.
         * */
        StringBuffer buffer = new StringBuffer();
        buffer.append("abd\n");
        buffer.append("def");
        System.out.println(buffer);

        buffer.insert(4, "@");
        System.out.println(buffer);

        String str = buffer.toString();
//        System.out.println(str);
    }

    public void basic_2() {
        StringBuilder builder = new StringBuilder();
        builder.append("123\n");
        builder.append("456");
        System.out.println(builder);

        String str = builder.toString();
//        System.out.println(str);
    }

    public void stringFormat() {
        String text = MessageFormat.format("This is text ''{0}''", "쿠쿠루삥뽕");
        System.out.println("text = " + text);
    }
}
