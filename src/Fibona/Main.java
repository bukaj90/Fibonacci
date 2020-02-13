package Fibona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int t1 = 0, t2 = 1;

            Scanner zer = new Scanner(System.in);
            System.out.print("Enter number n: ");
            int n = zer.nextInt();

            System.out.print("First " + n + " terms: ");

            for (int i = 1; i <= n; ++i) {
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }catch (Exception z)
        {
            System.out.println("UPS!!");
        }
    }
}
