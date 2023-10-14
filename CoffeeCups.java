package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents different types of coffee cups that is available.
 * It creates instances of the CoffeeCups class and collects information from user, such as the type, quantity,
 * size, quantity and cost.
 */
public class CoffeeCups extends TimsProduct{
    private String size;
    private int quantity;

    /**
     * constructor of the CoffeeCups class
     * @param name name of the product
     * @param size size of the product
     * @param quantity quantity of the product
     * @param cost cost of the product
     * @param price price of the product
     */
    private CoffeeCups(String name, String size, int quantity, double cost, double price ){
        super(name, cost, price);
        this.size=size;
        this.quantity=quantity;
    }

    /**
     * ask user for necessary information and create instance of CoffeeCups
     * @return Instance of CoffeeCups
     */
    public static CoffeeCups create(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type of the cups(paper, ceramic, plastic): ");
        String name = sc.nextLine() + "cups";

        System.out.println("Enter the size of coffee cups(S, M or L): ");
        String size = sc.nextLine();

        System.out.println("Enter quantity of cups per batch: ");
        int quantity = sc.nextInt();

        System.out.println("Enter cost of coffee cups: ");
        double cost = sc.nextDouble();

        System.out.println("Enter price of coffee cups: ");
        double price = sc.nextDouble();

        CoffeeCups cups = new CoffeeCups(name,size,quantity,cost,price);
        return cups;
    }


    /**
     *
     * @return size
     */
    public String getSize(){
        return size;
    }

    /**
     * represent to give available quantity
     * @return quantity of product
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     *
     * @return string presentation of CoffeeCups class
     */
    @Override
    public String toString(){

        return super.toString() + "\nBoxOfNails[Size of cups: "+ getSize()+", Quantity: "+getQuantity()+"]";
    }

}
