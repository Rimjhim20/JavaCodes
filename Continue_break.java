public class Continue_break {
    public static void main(String[] args){
        
        for(int i=1;i<=10;i++){
            if(i%5 != 0){
                System.out.println(i);
                continue;
            }else{
                break;
            }
        }
    }
}

//loop1:i=1<=10 true
//1%5=1!=0 true
//print i //i=1

// loop:2
// i=2<=10  true
//2%5!=0 true
//print i //i=2

// loop:3
// i=3<=10  true
//3%5!=0 true
//print i //i=3

// loop:4
// i=4<=10  true
//4%5!=0 true
//print i //i=4

// loop:4
// i=5<=10  true
//5%5!=0 false


