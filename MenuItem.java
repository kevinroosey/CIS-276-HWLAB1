/*
    Kevin Roosey CIS-276 Homework 1
*/

import java.text.NumberFormat;

public class MenuItem {

    /* Private instance vars */
    private String itemName;
    private int prepTime;
    private double price;

    /* Default constructor */
    public MenuItem(){} 

    /* 3 parameter constructor */
    public MenuItem(String n, int t, double p)
    {
        itemName = n;
        prepTime = t;
        price = p;
    }

    /* Copy constructor */
    public MenuItem(MenuItem existing)
    {
        itemName = existing.itemName;
        prepTime = existing.prepTime;
        price = existing.price;

    }
    

    /* ------------ GETTER AND SETTER METHODS --------- */

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void itemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the prepTime
     */
    public int getPrepTime() {
        return prepTime;
    }

    /**
     * @param prepTime the prepTime to set
     */
    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /* ------ Override toString() method ------ */
     @Override
    public String toString() {
        return String.format("%1$-50s", itemName)
            + String.format("%1$10s", prepTime).concat(" min") 
            + String.format("%1$10s", NumberFormat.getCurrencyInstance().format(price));
    }
}