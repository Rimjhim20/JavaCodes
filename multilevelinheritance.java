/*finding sum of 3 integers using multilevel inheritance*/
class GrandFather {
    String gf_car = "ambesder";
}

class Father extends GrandFather {
    String father_car = "Creta";
}

class Son extends Father {
    String son_car = "fortuner";

    public void showCars() {
        System.out.println("all cars of son are " + gf_car + " ," + father_car + " , " + son_car);
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.showCars();
    }
}
