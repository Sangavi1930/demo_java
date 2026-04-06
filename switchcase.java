import java.util.*;
public class switchcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=77;
        switch (mark / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 5:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
        }
    }
}