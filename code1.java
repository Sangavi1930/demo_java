import java.util.*;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        if (a >= 0 && a <= 100) {
            System.out.println("0");
        } 
        else if (a >= 101 && a <= 200) {
            System.out.println(a * 0.8);
        } 
        else if (a >= 201 && a <= 300) {
            System.out.println(a * 1.5);
        } 
        else {
            System.out.println(a * 3);
        }
    }
}