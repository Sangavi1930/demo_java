import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double t = sc.nextDouble();
        int tInt = (int) t;
        double diff = t - tInt;
        System.out.println("Double: " + t);
        System.out.println("Int: " + tInt);
        System.out.println("Difference: " + diff);
    }
}