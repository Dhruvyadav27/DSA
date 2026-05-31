package recursion;
class treerecursion{
 static void same(int a){
    if (a>0){
      System.out.println(a);
      same(a-1); 
      same(a-1); 
    }
    
 }

    public static void main(){
  
          int x=4;
          same(x);

    }
}