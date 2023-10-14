package Assignment7_000905034;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents an abstract class - RentableHardware. It extends the TimsProduct class and implements the Rentable interface.
 * It provides a base class for rentable products.
 */
public abstract class RentableHardware extends TimsProduct implements Rentable{

    private double rentalCost;
    private boolean rented = false;

    /**
     * Constructor of RentableHardware
     * @param name name of the product
     * @param rentalCost rental cost of the product
     * @param cost cost of the product
     * @param price price of the product
     */
    public RentableHardware(String name, double rentalCost, double cost, double price){
        super(name, cost, price);
        this.rentalCost = rentalCost;
    }


    /**
     * change rented variable to true
     */
    @Override
    public void rent() {
        rented = true;
    }


    /**
     * change rented variable to false as it is returned
     */
    @Override
    public void returned() {
        rented = false;
    }


    /**
     *
     * @return check whether equipment is rented or not
     */
    @Override
    public boolean isRented() {
        return rented;
    }

    /**
     *
     * @return rental cost of the product
     */
    public double getRentalCost(){
        return rentalCost;
    }

    /**
     *
     * @return string presentation of RentableHardware class
     */
     public String toString(){
        return super.toString() +"\nRentableHardware["+ "Rental Cost: "+ getRentalCost() + " rented: " + isRented()+"]";
     }
}