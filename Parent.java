import java.util.ArrayList;

public class Parent {
    ArrayList language=null;
    public void setData(){
    language =new ArrayList();
    language.add("Java");
    language.add("C++");
    language.add("C");
    language.add("Python");
    }
    public void getData(){
    for(int i=0;i<language.size();i++){
    System.out.println(language.get(i));
    }
    }
    public static void main(String[] args){
    Parent p=new Parent();
    p.setData();
    p.getData();
    
    
    
    }
    
    
    
    }
    
    