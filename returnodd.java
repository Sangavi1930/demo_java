public class returnodd {
    public static void main(String[] args) {
        int a=15;
        System.out.println(checkodd(a));

    }
    static String checkodd(int n){
        if(n/2==0){
            return "even";
        }else{
            return "odd";
        }

    }
    
}
