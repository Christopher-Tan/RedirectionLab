import java.util.*;
public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (n.hasNextLine()) {
            Scanner m = new Scanner(n.nextLine());
            while (m.hasNext()) {
                String s = m.next();
                for (int i = 0; i < s.length(); i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}