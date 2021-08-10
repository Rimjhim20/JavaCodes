//string immutability- value of string  never change
//java string depends on value rather than variable
package string;

public class stringimmutability {
    public static void main(String[] args){
        String name="Rimjhim";
        System.out.println(name.concat("Kumari"));
        name=name.concat("Rimjhim");
        System.out.println(name);
       
        }
}
