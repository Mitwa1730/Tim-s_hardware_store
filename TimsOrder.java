package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents the order that is placed by a customer.
 * This class creates an order by asking the user for the products they want to buy and it also calculates
 * the total amount for the order
 */

public class TimsOrder {
    private int size;
    public String customerName;

    public TimsProduct[] products;


    /**
     *
     * @param customerName name of the customer
     * @param size size of the product
     */
    private TimsOrder(String customerName, int size) {
        this.size = size;
        this.customerName = customerName;
        products = new TimsProduct[size];
    }


    /**
     * ask user for necessary information and create instance of TimsOrder
     * it store all the product which are ordered by the customer in products array
     * @return Instance of TimsOrder
     */
    public static TimsOrder create(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.println("Enter Number of Products (1 - 5): ");
        int numberOfProducts = sc.nextInt();


        TimsOrder timsOrder = new TimsOrder(customerName, numberOfProducts);

        for(int i=0; i<numberOfProducts; i++){

            System.out.println("Enter Product Type:");
            System.out.println("\tA.Box Of Nails:");
            System.out.println("\tB.Nail Gun:");
            System.out.println("\tC.Coffee cups:");
            System.out.println("\tD.Dining table:");
            String userInput = sc.next().toUpperCase();

            switch (userInput){
                case "A":
                    BoxOfNails product1 = BoxOfNails.create();
                    timsOrder.products[i] = product1;
                    break;
                case "B":
                    NailGun product2 = NailGun.create();
                    timsOrder.products[i] = product2;
                    break;
                case "C":
                    CoffeeCups product3 = CoffeeCups.create();
                    timsOrder.products[i] = product3;
                    break;
                case "D":
                    DiningTable product4 = DiningTable.create();
                    timsOrder.products[i] = product4;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        return timsOrder;
    }


    /**
     *
     * @return total amount of the ordered items
     */
    public double getAmountDue(){
        double total=0.0;
        for(var product : products){
            if (product instanceof NailGun) {
                NailGun nailGun = (NailGun) product; // Perform downcasting
                if(nailGun.isRented()){
                    total += nailGun.getRentalCost();
                }
                else{
                    total += nailGun.getRetailPrice();
                }
            }
            else if (product instanceof DiningTable) {
                DiningTable diningTable = (DiningTable) product; // Perform downcasting
                if(diningTable.isRented()){
                    total += diningTable.getRentalCost();
                }
                else{
                    total += diningTable.getRetailPrice();
                }
            }
            else{
                total += product.getRetailPrice();
            }

        }
        return total;
    }

    /**
     *
     * @return size of the TimOrder
     */
    public int getSize(){
        return size;
    }


    /**
     *
     * @return string presentation of TimsOrder class
     */
    @Override
    public String toString(){
        String report = "Order For: "+customerName + "\n";
        for(TimsProduct product : products){
            report += "\n" + product.toString()+ "\n";
        }
        return report;
    }
}
