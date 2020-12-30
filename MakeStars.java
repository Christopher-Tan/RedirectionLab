import java.util.*;
public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        boolean use1 = false;
        while (n.hasNextLine()) {
            if (use1) {System.out.println("");} else {use1 = true;}
            Scanner m = new Scanner(n.nextLine());
            boolean use2 = false;
            while (m.hasNext()) {
                if (use2) {System.out.print(" ");} else {use2 = true;}
                String s = m.next();
                for (int i = 0; i < s.length(); i++) {
                    System.out.print("*");
                }
            }
        }
    }
}