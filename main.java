import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 Dirham");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency:");

        int choice = sc.nextInt();
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
            Ruppe_to_other(amount);
            break;
            case 2:
            Dollar_to_other(amount);
            break;
            case 3:
            Euro_to_other(amount);
            break;
            case 4:
            Dirham_to_other(amount);
            break;
            default:
            System.out.println("Invalid Choice!!");
        }
    }
    public static void Ruppe_to_other(double amt) {
        System.out.println("1 Ruppe = " + 0.013 + " Dollar");
        System.out.println();

        System.out.println(amt + " Ruppe = " + (amt*0.013) + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + 0.012 + " Euro");
        System.out.println();
        
        System.out.println(amt + " Ruppe = " + (amt*0.012) + " Euro");
        System.out.println();

        System.out.println("1 Rupee = " + 0.044 + " Dirham");
        System.out.println();
        
        System.out.println(amt + " Ruppe = " + (amt*0.044) + " Dirham");
        System.out.println();
    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 83.92 + " Ruppe");
        System.out.println();

        System.out.println(amt + " Dollar = " + (amt*83.92) + " Ruppe");
        System.out.println();

        System.out.println("1 Dollar = " + 0.98 + " Euro");
        System.out.println();
        
        System.out.println(amt + " Dollar = " + (amt*0.98) + " Euro");
        System.out.println();

        System.out.println("1 Dollar = " + 3.67 + " Dirham");
        System.out.println();
        
        System.out.println(amt + " Dollar = " + (amt*3.67) + " Dirham");
        System.out.println();
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 80.85 + " Ruppe");
        System.out.println();

        System.out.println(amt + " Euro = " + (amt*80.85) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();
        
        System.out.println(amt + " Euro = " + (amt*1.02) + " Dollar");
        System.out.println();

        System.out.println("1 Euro = " + 4.10 + " Dirham");
        System.out.println();
        
        System.out.println(amt + " Euro = " + (amt*4.10) + " Dirham");
        System.out.println();
    }

    public static void Dirham_to_other(double amt) {
        System.out.println("1 Dirham = " + 22.85 + " Ruppe");
        System.out.println();

        System.out.println(amt + " Dirham = " + (amt*22.85) + " Ruppe");
        System.out.println();

        System.out.println("1 Dirham = " + 0.27 + " Dollar");
        System.out.println();
        
        System.out.println(amt + " Dirham = " + (amt*0.27) + " Dollar");
        System.out.println();

        System.out.println("1 Dirham = " + 0.24 + " Euro");
        System.out.println();
        
        System.out.println(amt + " Dirham = " + (amt*0.24) + " Euro");
        System.out.println();
    }
}
