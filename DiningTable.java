package Assignment7_000905034;

import java.util.Scanner;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This DiningTable class extends the RentableHardware class.
 * It represents a dining table that can be rented or can be purchased by user.
 */
public class DiningTable extends RentableHardware{
    private String features;
    private String material;

    /**
     * Constructor of Dinning table class
     * @param name name of the product
     * @param features special feature of the product
     * @param material material of the product
     * @param rentalCost rental cost of the product
     * @param cost cost of the product
     * @param price price of the product
     * @param status (rent/buy) status of the product
     */
    private DiningTable(String name, String features, String material, double rentalCost, double cost, double price, String status){
        super(name, rentalCost, cost, price);
        this.features = features;
        this.material = material;
        if("rent".equalsIgnoreCase(status)){
            super.rent();
        }
    }


    /**
     * ask user for necessary information and create instance of DiningTable
     * @return Instance of DiningTable
     */
    public static DiningTable create(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of table(round/square): ");
        String name = input.nextLine() + "table";

        System.out.println("Please Enter feature of table(4 seats/6 seats): ");
        String feature = input.nextLine();

        System.out.println("Please Enter material of table(wood, plastic, granite): ");
        String material = input.nextLine();

        System.out.println("Please Enter Cost of table: ");
        Double cost = input.nextDouble();

        System.out.println("Please Enter Price of table: ");
        Double price = input.nextDouble();

        System.out.println("Please Enter rent of table: ");
        Double rentalCost = input.nextDouble();

        System.out.println("Please Enter Status of Gun (rent/buy): ");
        String status = input.next();

        DiningTable table = new DiningTable(name,feature,material,rentalCost,cost,price, status);
        return table;
    }

    /**
     * @return return special feature of the product
     */
    public String getFeatures(){
        return "features: "+ features;
    }

    /**
     * @return return material of the product
     */
    public String getMaterial(){
        return material;
    }

    /**
     * @return string presentation of DinningTable class
     */
    @Override
    public String toString(){
        return super.toString() +" \nDiningTable[material: "+ getMaterial()+" feature: "+ getFeatures() + "]";
    }
}
