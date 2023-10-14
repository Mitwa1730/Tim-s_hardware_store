package Assignment7_000905034;

/**
 * @Author: Mitwa Patel, 000905034
 * Date: 8th August 2023
 * This class represents an interface called Rentable.
 * This interface implement to product which is rentable.
 */

public interface Rentable {

    /**
     * manipulate rented variable
     */
    public void rent();

    /**
     * returned equipment
     */
    public void returned();

    /**
     * check equipment is rented or not
     * @return check equipment is rented or not
     */
    public boolean isRented();
}
