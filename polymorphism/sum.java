package polymorphism;

/*static polymorphism*/
class Polymorphism{
    public int sum(int a,int b){
    return (a+b);
    }
    public double sum(int a,int b,int c){
    float sum=a+b+c;
    return (sum);
    }
    public double sum(int a,int b,int c,int d){
        float sum=a+b+c+d;
        return (sum);
        }
    public static void main(String[] args){
    Polymorphism sp=new Polymorphism();
    System.out.println("sum of 2 num="+sp.sum(5,10));
    System.out.println("sum of 3 num="+sp.sum(5,10,21));
    System.out.println("sum of 4 num="+sp.sum(5,10,8,32));
    }
    }
    
    