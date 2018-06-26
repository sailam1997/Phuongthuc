import java.util.Scanner;

public class BaiTapDoiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("Enter your choice");
            choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. F to C");
                    break;
                case 2:
                    System.out.println("2. C to F");
                    break;
                case 0:
                    System.out.println("0. Exit");
                    System.exit(0);
            }
        }while(choice!=0);
    }
    public static double CtoF (double C) {
        double F = (9.0 / 5) * C + 32;
        return F ;

    }
    public static  double FtoC (double F) {
        double C = (5 / 9) * (F -32);
        return C;
    }
}
