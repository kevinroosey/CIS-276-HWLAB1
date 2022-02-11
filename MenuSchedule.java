/*
    Kevin Roosey CIS-276 Homework 1
*/

import java.text.NumberFormat;

public class MenuSchedule {

    //* Private instance vars */
    private String weekday;
    private MenuItem soup;
    private MenuItem salad;
    private MenuItem entree;
    private MenuItem dessert;
    private int totalPrepTime;
    private double totalPrice;
    
    /* This method calculates the total prep time for all MenuItem objects */
    public void calcTotalPrepTime(int a, int b, int c, int d) {
        totalPrepTime = a + b + c + d;
    }
    /* This method calculates the total prices for all MenuItem objects */
    public void calcTotalPrice(double w, double x, double y, double z) {
        totalPrice = w + x + y + z;
    }

    /* Default constructor */
    public MenuSchedule(){} 


    /* 3 parameter constructor */
    public MenuSchedule(String wd, MenuItem sp, MenuItem sal, MenuItem e, MenuItem d)
    {
        weekday = wd;
        soup = new MenuItem(sp);
        salad = new MenuItem(sal);
        entree = new MenuItem (e);
        dessert = new MenuItem(d);
        calcTotalPrepTime(soup.getPrepTime(), salad.getPrepTime(),entree.getPrepTime(),dessert.getPrepTime());
        calcTotalPrice(soup.getPrice(), salad.getPrice(), entree.getPrice(), dessert.getPrice());
    }
    /* Copy constructor */
    public MenuSchedule(MenuSchedule existing)
    {
        weekday = existing.weekday;
        soup = existing.soup;
        salad = existing.salad;
        entree = existing.entree;
        dessert = existing.dessert;
        totalPrepTime = existing.totalPrepTime;
        totalPrice = existing.totalPrice;

    }

    /* ------------ GETTER AND SETTER METHODS --------- */
    /**
     * @return the weekday
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * @param weekday the weekday to set
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /**
     * @return the soup
     */
    public MenuItem getSoup() {
        return new MenuItem (soup);
    }

    /**
     * @param soup the soup to set
     */
    public void setSoup(MenuItem soup) {
        this.soup = soup;
    }

    /**
     * @return the salad
     */
    public MenuItem getSalad() {
        return new MenuItem(salad);
    }

    /**
     * @param salad the salad to set
     */
    public void setSalad(MenuItem salad) {
        this.salad = salad;
    }
    /**
     * @return the entree
     */
    public MenuItem getEntree() {
        return new MenuItem(entree);
    }

    /**
     * @param entree the entree to set
     */
    public void setEntree(MenuItem entree) {
        this.entree = entree;
    }
    /**
     * @return the dessert
     */
    public MenuItem getDessert() {
        return new MenuItem(dessert);
    }

    /**
     * @param dessert the dessert to set
     */
    public void setDessert(MenuItem dessert) {
        this.dessert = dessert;
    }

    /**
     * @param totalPrepTime the totalPrepTime to set
     */
    public void setTotalPrepTime(int totalPrepTime) {
        this.totalPrepTime = totalPrepTime;
    }
    
    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    /* ------ Override toString() method ------ */
    @Override
    public String toString() {
        return String.format("\n\n" + weekday)
            + "\n--------------------------------------------------------------------------\n"
            + soup.toString() + "\n"
            + salad.toString() + "\n"
            + entree.toString() + "\n"
            + dessert.toString() + "\n"
            + "--------------------------------------------------------------------------\n"
            + String.format("%1$-50s", "Total") + String.format("%1$10s", totalPrepTime) + " min"
            + String.format("%1$10s", NumberFormat.getCurrencyInstance().format(totalPrice));
    }
}