package Array.OOPS;

/*Copy constructor*/
class CopyConst1{
    int a,b;
    public CopyConst1(){
    System.out.println("object has initialized with default value");
    }
    public CopyConst1(int a,int b){
    this(); // calling constructor of the current class using this
    this.a=a;
    this.b=b; //accessing data member using this
    this.print();//accessing member method using this
    }
    public CopyConst1(CopyConst1 copy1){ // copy constructor - constructor overloading
    a=copy1.a;
    b=copy1.b;
    print();
    }
    public void print(){
    System.out.println("a="+a+",b="+b);
    }
    public static void main(String[] args){
    CopyConst1 copy1=new CopyConst1(2,4);
    CopyConst1 copy2=new CopyConst1(copy1);
    copy1.print();
    copy2.print();
    }
    
    
    
    }
    
    
