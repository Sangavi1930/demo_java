import java.util.*;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 5000) {
            System.out.println("20% discount");
        } 
        else if (a >= 2000 ) {
            System.out.println("10% discount");
        } 
        else {
            System.out.println("No discount");
        }
    }
}