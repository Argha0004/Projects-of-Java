// Task_4(CURRENCY CONVERTER PROJECT)

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Task_4 {

    private static NumberFormat f;

    public static void main(String[] args) {
        double rupee, dollar, pound, amount, euro, KWD;
        DecimalFormat file = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.print("*****************Welcome to all my Currency Converter Project*****************");
        amount = sc.nextInt();
        if (amount == 1) {
            System.out.print("\nEnter the amount in Rupee: ");
            rupee = sc.nextDouble();
            dollar = rupee / 77.34;
            System.out.print("\nDollar: " + f.format(dollar));
            pound = rupee / 94.46;
            System.out.print("\nPound: " + f.format(pound));
            euro = rupee / 80.36;
            System.out.print("\nEuro: " + f.format(euro));
            KWD = rupee / 251.92;
            System.out.print("\nKuwaiti Dinar: " + f.format(KWD));

        } else if (amount == 2) {
            System.out.print("\nEnter the amount in Dollar: ");
            dollar = sc.nextDouble();
            rupee = dollar * 77.34;
            System.out.print("\nRupees: " + f.format(rupee));
            pound = dollar * 0.82;
            System.out.print("\nPound: " + f.format(pound));
            euro = dollar * 0.96;
            System.out.print("\nEuro: " + f.format(euro));
            KWD = dollar * 0.31;
            System.out.print("\nKuwaiti Dinar: " + f.format(KWD));

        } else if (amount == 3) {
            System.out.print("\nEnter the amount in Pound: ");
            pound = sc.nextDouble();
            rupee = pound * 94.46;
            System.out.print("\nDollar: " + f.format(rupee));
            dollar = pound * 1.22;
            System.out.print("\nPound: " + f.format(dollar));
            euro = pound * 1.17;
            System.out.print("\nEuro: " + f.format(euro));
            KWD = pound * 0.3748;
            System.out.print("\nKuwaiti Dinar: " + f.format(KWD));

        } else if(amount == 4) {
            System.out.print("\nEnter the amount in Euro: ");
            euro = sc.nextDouble();
            rupee = euro * 88.43;
            System.out.print("\nDollar: " + f.format(rupee));
            dollar = euro * 1.04;
            System.out.print("\nPound: " + f.format(dollar));
            pound = euro * 0.85;
            System.out.print("\nEuro: " + f.format(pound));
            KWD = euro * 0.318949;
            System.out.print("\nKuwaiti Dinar: " + f.format(KWD));

        } else if (amount == 5) {
            System.out.print("\nEnter the amount in Kuwaiti Dinar: ");
            KWD = sc.nextDouble();
            rupee = KWD * 251.96;
            System.out.print("\nRupee: " + f.format(rupee));
            dollar = KWD * 3.26;
            System.out.print("\nDollar: " + f.format(dollar));
            pound = KWD * 2.67;
            System.out.print("\nPound: " + f.format(pound));
            euro = KWD * 3.13;
            System.out.print("\nEuro: " + f.format(euro));

        } else {
            System.out.println("Invalid Code!!");
        }
    }
}
