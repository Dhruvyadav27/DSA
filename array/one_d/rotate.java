package array.one_d;
public class rotate {
    public static void main (String[] arg){
       int a[]={2,2,3,4,5,6,7,8,9};
       int d=3;
       int c,e,f,g;
       int b=a.length;
       int h=a.length;
       g=d;
       for(int i=0; i<d/2;i++){
          c=a[i];
          a[i]=a[d-1];
          a[d-1]=c;
          d--;

       }
       for(int i=g; i<=(b+g)/2;i++){
          e=a[i];
          a[i]=a[b-1];
          a[b-1]=e;
          b--;

       }
       for(int i=0; i<a.length/2;i++){
          
          f=a[i];
          a[i]=a[b-1];
          a[b-1]=f;
          b--;

       }
       for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
       }
    }
}
