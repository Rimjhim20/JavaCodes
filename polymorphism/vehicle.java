package polymorphism;

class vehicle{
    public void speedvehicle(){
        System.out.println("Speed of vehicle is 100 kmph");
    }
}
class car extends vehicle{
    public void speedvehicle(){
        super.speedvehicle();
        System.out.println("Speed of car is 60 kmph");
      
    }
    public static void main(String[] args){
        car c=new car();
        c.speedvehicle();
    }
}