import java.util.Arrays;
public class PigLatin {
    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        if (Arrays.asList(new String[]{"a","e","i","o","u"}).contains(s.substring(0,1))) {
            return s + "hay";
        }
        return s.substring(1,s.length()) + s.substring(0,1) + "ay";
    }
    public static void main(String[] args) {
        System.out.println(pigLatinSimple("mock"));
        System.out.println(pigLatinSimple("pie"));
        System.out.println(pigLatinSimple("david"));
        System.out.println(pigLatinSimple("aaron"));
    }
}