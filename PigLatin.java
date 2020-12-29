import java.util.Arrays;
public class PigLatin {
    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        if (Arrays.asList(new String[]{"a","e","i","o","u"}).contains(s.substring(0,1))) {
            return s + "hay";
        }
        return s.substring(1,s.length()) + s.substring(0,1) + "ay";
    }
    public static String pigLatin(String s) {
        s = s.toLowerCase();
        String[] digraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        if (Arrays.asList(digraphs).contains(s.substring(0,2))) {
            return s.substring(2,s.length()) + s.substring(0,2) + "ay";
        }
        return pigLatinSimple(s);
    }
    public static void main(String[] args) {
        System.out.println(pigLatinSimple("mock"));
        System.out.println(pigLatinSimple("pie"));
        System.out.println(pigLatinSimple("david"));
        System.out.println(pigLatinSimple("aaron"));
        System.out.println(pigLatin("the"));
        System.out.println(pigLatin("check"));
        System.out.println(pigLatin("skee"));
        System.out.println(pigLatin("emu"));
        System.out.println(pigLatin("grade"));
    }
}