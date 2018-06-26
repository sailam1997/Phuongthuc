import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double C;
        double F;
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            choice=input.nextInt();
            switch (choice) {
                case 1 :System.out.println("1. F to C");
                    System.out.println("Enter F" );
                    F=input.nextDouble();
                    System.out.println("F to C = " +FtoC(F));
                    break;
                case 2 :System.out.println("2. C to F");
                    System.out.println("Enter C");
                    C=input.nextDouble();
                    System.out.println("C to F = " +CtoF(C));
                    break;
                case 0:System.out.println("0. Exit");
                    System.exit(0);
            }
        } while (choice!=0);

    }

    public static double CtoF(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double FtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }


}

