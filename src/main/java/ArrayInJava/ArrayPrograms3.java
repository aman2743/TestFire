package ArrayInJava;

public class ArrayPrograms3 {
    public static void main(String[] args) {
       int arr[]=new int[10];
       int l=arr.length;
   for(int i=0;i<l;i++){
       arr[i]=i+1;
   }
   for(int x:arr){
       System.out.println(x);
   }
    }
}
