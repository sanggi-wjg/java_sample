package CheatSheet;

public class StringSample {

    public void basic() {
        // 속도는 StringBuilder 가 빠른데 안전성은 StringBuffer 가 더 좋음
        StringBuffer buffer = new StringBuffer();
        buffer.append("123\n");
        buffer.append("abc\n");
        System.out.println(buffer);
    }

    public void basic_2() {
        StringBuilder builder = new StringBuilder();
        builder.append("123\n");
        builder.append("abc");
        System.out.println(builder);
    }
}
