import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.capitalize("sergey"));
        simpleTest();
        nullTest();
        emptyTest();

    }

    public static void simpleTest() {
        System.out.println(
                "12".equals(StringUtils.capitalize("12"))
        );
    }

    public static void nullTest() {
        System.out.println(
                null == (StringUtils.capitalize("12"))
        );
    }

    public static void emptyTest() {
        System.out.println(
                " ".equals(StringUtils.capitalize(" "))
        );
    }
}