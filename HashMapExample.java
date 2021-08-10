
public class HashMapExample {
    public static void main(String[] args){
    HashMap hm=new HashMap();
    hm.put(1, "Rana");
    hm.put(2, "Sumit");
    hm.put(3, "Akhil");
    Set hashset=hm.entrySet();
    Iterator itr=hashset.iterator();
    while(itr.hasNext()){
    Map.Entry entry=(Map.Entry)itr.next();
    System.out.println("key="+entry.getKey()+",value="+entry.getValue());
    }
    }
    }
    
    
