package recursion;
public class static_globalvariable{

    static int x=0;
    static int fun(int n){
      
        if(n>0){
          x++;
        System.out.println(n);
        return fun(n-1)+x;
        //System.out.println(n);  this is unrechable statement
    }
        else{
            return 0;
        }
}


    public static void main(String[] arg){
       int y=8;
       //System.out.println(fun(y));
       fun(y);
    }
}