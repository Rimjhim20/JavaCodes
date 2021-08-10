package string;

public class compareto {
    public static void main(String[] args) {
        String name1 = "Mani";
        String name2 = "Mani Gautam";
        int result = name1.compareTo(name2);
        if (result == 0) {
            System.out.println("Both strings are equals");
        } else if (result > 0) {

            System.out.println("First string is bigger than second");
        } else {
            System.out.println("First string is smaller than second");
        }

    }

}
