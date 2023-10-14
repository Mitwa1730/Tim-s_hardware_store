package Assignment7_000905034;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents product available at the store. It includes different types
 * of products, and stores their information such as name, production cost, and retail price.
 * This class also implements the Commodity interface.
 */
public class TimsProduct implements Commodity {
    private String name;
    private double cost;
    private double price;


    /**
     * @param name name of the product
     * @param cost making cost of the product
     * @param price price of the product
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }


    /**
     *
     * @return name of the product
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return product cost of the product
     */
    @Override
    public double getProductionCost() {
        return cost;
    }


    /**
     *
     * @return retail price of the product
     */
    @Override
    public double getRetailPrice() {
        return price;
    }


    /**
     *
     * @return string presentation of TimsProduct class
     */
    @Override
    public String toString() {
        return "TimsProduct[" + "name='" + getName() + '\'' + ", cost=" + getProductionCost() + ", price="
                + getRetailPrice() + ']';
    }


}
