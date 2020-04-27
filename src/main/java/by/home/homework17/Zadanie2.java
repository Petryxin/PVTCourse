package by.home.homework17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie2 {
    private static final Pattern PATTERN = Pattern.compile("(\\s*)[EDR]{1}(\\s*)(\\d(\\s*)){12}");
    public static void main(String[] args) {

        Matcher check1 = PATTERN.matcher("R   465257591123");
        Matcher check2 = PATTERN.matcher("N   465257591123");
        Matcher check3 = PATTERN.matcher("K111111111111");
        Matcher check4 = PATTERN.matcher("   E  1   1  1  1  1 1  1 1 1 1 1     1");
        Matcher check5 = PATTERN.matcher("R333333333333");

        System.out.println(check1.matches());
        System.out.println(check2.matches());
        System.out.println(check3.matches());
        System.out.println(check4.matches());
        System.out.println(check5.matches());
    }
}
