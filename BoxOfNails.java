package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents a type of product. It creates instances of the BoxOfNails class
 * and collects details from user, such as the name, size, quantity, cost, and price.
 */
public class BoxOfNails extends TimsProduct{

    private double size;
    private int quantity;

    /**
     * constructor of the BoxOfNails class
     * @param name name of the product
     * @param size size of the product
     * @param quantity quantity of the product
     * @param cost cost of the product
     * @param price price of the product
     */
    private BoxOfNails(String name, double size, int quantity, double cost, double price ){
        super(name, cost, price);
        this.size=size;
        this.quantity=quantity;
    }

    /**
     * ask user for necessary information and create instance of BoxOfNails
     * @return Instance of BoxOfNails
     */
    public static BoxOfNails create(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the Nail: ");
        String name = sc.nextLine();

        System.out.println("Enter the size of the nail box (in integer): ");
        double size = sc.nextDouble();

        System.out.println("Enter quantity of nails in nailBox: ");
        int quantity = sc.nextInt();

        System.out.println("Enter cost of the nail: ");
        double cost = sc.nextDouble();

        System.out.println("Enter price of the nail: ");
        double price = sc.nextDouble();

        BoxOfNails nails = new BoxOfNails(name,size,quantity,cost,price);
        return nails;

    }

    /**
     *
     * @return size of BoxOfNails
     */
    public double getSize(){
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
     * @return string presentation of BoxOfNails class
     */
    @Override
    public String toString(){

        return super.toString() + "\nBoxOfNails[Size: "+ getSize()+", Quantity: "+getQuantity()+"]";
    }

}
