package MultidimensionalArray;

public class BubbleSortInJavaInDescendingOrder {
    public static void main(String[] args) {
        int arr[]={9,0,11,8,7,1,2,5};
        //in Descending order
        int len=arr.length;
        int temp=0;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <len-(i-1) ; j++) {
                if(arr[j-1]<arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i <len ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
