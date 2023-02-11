import java.util.Scanner;
public class salesclerks {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("number of donuts ="  );
        int A = sc.nextInt();
        System.out.print("number of cupcakes =  "  );
        int B = sc.nextInt();
        System.out.print("cups of coffee   ="  );
        int C = sc.nextInt();
        
        double D = A * 0.95 ;
        double E = B * 1.20 ;
        double F = C * 1.50 ;
        
        double total;
        total = D + E + F;
        System.out.println("Total price =RM" + total  );
        
    }
}