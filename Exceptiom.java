public class Exceptiom {
    public static void main(String[] args){

        try{
    int[] arr= new int[5];
    System.out.println(arr[5]);
        }catch(Exception ex){
            System.out.println(ex.getMessage()+ " has occured");
        }
    }

}
