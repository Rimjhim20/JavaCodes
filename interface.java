
interface Animal{
    void show();
    }
    class Cow implements Animal{
    public void show()
    {
    System.out.println("Cow is a pet animal");
    }
    public static void main(String[] args){
    Cow cow=new Cow();
    cow.show();
    }
    }