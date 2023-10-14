package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This NailGun class extends the RentableHardware class.
 * It represents a nail gun, which can be rented or can be purchased by user.
 */
public class NailGun extends RentableHardware{

    private String features;

    /**
     *Constructor of NailGun class
     * @param name name of the product
     * @param features special feature of the product
     * @param rentalCost rental cost of the product
     * @param cost cost of the product
     * @param price price of the product
     * @param status (rent/buy) status of the product
     */
    private NailGun(String name, String features, double rentalCost, double cost, double price, String status){
        super(name, rentalCost, cost, price);
        this.features = features;
        if("rent".equalsIgnoreCase(status)){
            super.rent();
        }
    }

    /**
     * ask user for necessary information and create instance of NailGun
     * @return Instance of NailGun
     */
    public static NailGun create(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Nails Gun Name: ");
        String name = input.nextLine();

        System.out.println("Please Enter feature of Gun (color, shape, etc): ");
        String feature = input.nextLine();

        System.out.println("Please Enter Cost of Gun: ");
        Double cost = input.nextDouble();

        System.out.println("Please Enter Price of Gun: ");
        Double price = input.nextDouble();

        System.out.println("Please Enter rent of Gun: ");
        Double rentalCost = input.nextDouble();

        System.out.println("Please Enter Status of Gun (rent/buy): ");
        String status = input.next();

        NailGun nailGun = new NailGun(name,feature,rentalCost,cost,price, status);
        return nailGun;
    }

    /**
     *
     * @return return special features of the product
     */
    public String getFeatures(){
        return "features: "+ features;
    }


    /**
     *
     * @return string presentation of NailGun class
     */
    @Override
    public String toString(){
        return super.toString() +" \nNailGun[feature: "+ getFeatures() + "]";
    }
}
