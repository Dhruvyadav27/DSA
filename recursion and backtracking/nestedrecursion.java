package recursion;
public class nestedrecursion {
   static int fun(int a){
    if(a>100){
      // System.out.println(a);
       return fun (a-11);
    
   } 
   else{
      //System.out.println(a);
      return fun(fun(a+12));
   } 
}

    public static void main (String[] arg){
      System.out.println(fun(95));
    }
}
