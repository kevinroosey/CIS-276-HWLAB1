/*
    Kevin Roosey CIS-276 Homework 1
*/

public class Restaurant {
    
    public static void main (String[] args) {
        //create an array to hold 3 MenuSchedule objects
        MenuSchedule thisWeek[] = new MenuSchedule[3];
        //create 4 menu items for Friday...
        MenuItem friSoup = new MenuItem("Lemon Cauliflower", 30, 7.95);
        MenuItem friSalad = new MenuItem("Cranberry Walnut", 5, 9.95);
        MenuItem friEntree = new MenuItem("Grilled Salmon with Asparagus", 25, 19.95);
        MenuItem friDessert = new MenuItem("Creme Brulee", 45, 7.95);
        //Create MenuSchedle for Friday
        thisWeek[0] = new MenuSchedule("FRIDAY", friSoup, friSalad, friEntree, friDessert);
        //create 4 menu items for Saturday...
        MenuItem satSoup = new MenuItem("Roasted Red Pepper Bisque", 25, 8.95);
        MenuItem satSalad = new MenuItem("Dandelion with Strawberries", 5, 11.95);
        MenuItem satEntree = new MenuItem("Pasta Primavera", 20, 14.95);
        MenuItem satDessert = new MenuItem("Flourless Chocolate Cake with Raspberry Sauce", 50, 7.95);
        //Create MenuSchedle for Saturday
        thisWeek[1] = new MenuSchedule("SATURDAY", satSoup, satSalad, satEntree, satDessert);
        //create 4 menu items for Sunday...
        MenuItem sunSoup = new MenuItem("Lobster Bisque", 30, 12.95);
        MenuItem sunSalad = new MenuItem("Tomato, Basil, and Mozzarella", 5, 9.95);
        MenuItem sunEntree = new MenuItem("Sweet Potato Lasagna", 60, 18.95);
        MenuItem sunDessert = new MenuItem("Assorted Biscotti", 40, 5.95);
        //Create MenuSchedle for Sunday
        thisWeek[2] = new MenuSchedule("SUNDAY", sunSoup, sunSalad, sunEntree, sunDessert);
        //zip through the array calling ToString (which we overrode) for each MenuSchedule object
        for(int i = 0; i < thisWeek.length; i++)
            System.out.println(thisWeek[i]);
    }
}