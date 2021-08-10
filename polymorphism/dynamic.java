package polymorphism;

// class ParentClass{
//     public void show(){
//     System.out.println("This is parent class method");
//     }
//     }
//     class ChildClass extends ParentClass{
//     public void show(){
//     super.show();
//     System.out.println("This is Child class method");
//     }
//     public static void main(String[] args){
//     ChildClass cc=new ChildClass();
//     cc.show();
//     }
//     }

class ParentClass {
    public void show() {
        System.out.println("This is parent class method");
    }
}

class ChildClass extends ParentClass {
    public void show() {
        System.out.println("This is Child class method");
    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.show();

    }
}