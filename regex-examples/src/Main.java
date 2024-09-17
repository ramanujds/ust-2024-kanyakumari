import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String pattern = "[a-z0-9]*";

        String str = "";

        boolean match = Pattern.matches(pattern,str);

        System.out.println(match);


    }
}