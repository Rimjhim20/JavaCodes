package constructor;

// public class parametrized {
//     int x;

//     public  parametrized (int y){
//         x = y;
//     }
//     public static void main(String[] args){
//         parametrized myObj = new parametrized(5);
//         System.out.println(myObj.x);
//     }
// }

// //Output 5

//When we have many parameters

// public class Main {
//     int modelYear;
//     String modelName;
  
//     public Main(int year, String name) {
//       modelYear = year;
//       modelName = name;
//     }
  
//     public static void main(String[] args) {
//       Main myCar = new Main(1969, "Mustang");
//       System.out.println(myCar.modelYear + " " + myCar.modelName);
//     }
//   }
  
//   // Outputs 1969 Mustang


class parametrized {
    String languages;
    // constructor accepting single value
   parametrized(String lang) {
      languages = lang;
     
    }
    public void  print(){
      System.out.println(languages + " Programming Language");
    }
    public static void main (String[] args) {
  
      // call constructor by passing a single value
     parametrized obj1 = new parametrized("Java");
     parametrized obj2 = new parametrized("Python");
     parametrized obj3 = new parametrized("C");
     obj1.print();
     obj2.print();
     obj3.print();
     
    }
  }
