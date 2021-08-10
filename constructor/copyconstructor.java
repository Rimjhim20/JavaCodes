package constructor;
public class copyconstructor {
    private double fprice;
    private String fname;
    copyconstructor(double fPrice, String fName) {
        fprice = fPrice;
        fname = fName;
    }
    // creating a copy constructor
    copyconstructor(copyconstructor fruit) {
        System.out.println("After invoking the Copy Constructor:");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }              
    double showPrice() {
        return fprice;                                                                                               // creating a method that returns the price of the fruit
    }
    // creating a method that returns the name of the fruit
    String showName() {
        return fname;
    }
    public static void main(String args[]) {
        copyconstructor f1 = new copyconstructor(200, "Apple");
        System.out.println("Name of the first fruit: " + f1.showName());
        System.out.println("Price of the first fruit: " + f1.showPrice());
        
        // passing the parameters to the copy constructor
        copyconstructor f2 = new copyconstructor(f1);
        System.out.println("Name of the second fruit: " + f2.showName());
        System.out.println("Price of the second fruit: " + f2.showPrice());
    }
}