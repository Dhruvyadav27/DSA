package recursion;
public class sumofnaturalnumber {
    static int s=0;
    static int sum(int a){
       
       if (a>0){
        
        s+=a;
        return sum(a-1);

       }
       
       else{
        System.out.println(s);
        return s;
       }
       
    }



    public static void main(String[] arf){
     System.out.println(sum(10));
     
    }
}
