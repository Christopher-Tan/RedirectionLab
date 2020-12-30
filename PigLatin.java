import java.util.Arrays;
public class PigLatin {
    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        if (Arrays.asList(vowels).contains(s.substring(0,1))) {
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
    public static String pigLatinBest(String s) {
        s = s.toLowerCase();
        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] notpunctuation = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        if (!Arrays.asList(letters).contains(s.substring(0,1))) {
            return s;
        }
        String punctuation = "";
        if (!Arrays.asList(notpunctuation).contains(s.substring(s.length()-1))) {
            punctuation += s.substring(s.length()-1);
            s = s.substring(0,s.length()-1);
        }
        return pigLatin(s) + punctuation;
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
        System.out.println(pigLatinBest("*emu"));
        System.out.println(pigLatinBest("4chan"));
        System.out.println(pigLatinBest("fish!"));
        System.out.println(pigLatinBest("fish"));
        System.out.println(pigLatinBest("the."));
        System.out.println(pigLatinBest("cat!"));
        System.out.println(pigLatinBest("amazing?"));
        System.out.println(pigLatinBest("apple%"));
    }
}