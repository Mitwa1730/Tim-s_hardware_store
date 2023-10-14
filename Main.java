package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * Main class.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimsOrder timeOrder = TimsOrder.create();
        System.out.println(timeOrder);
        System.out.printf("Total Price: $%.2f\n", timeOrder.getAmountDue());
    }
}
