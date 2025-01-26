package MultidimensionalArray;

public class MArray1 {
    public static void main(String[] args) {
        int arr[][] = new int[4][3];
        int count=10;
        int len = arr.length;
//        System.out.println(len);
        for (int i = 0; i < len; i++) {
            int len1=arr[i].length;
            for (int j = 0; j < len1; j++) {
                arr[i][j]=count;
                System.out.print(arr[i][j]);
                System.out.print(" ");
                count=count+2;
            }
            System.out.println();
        }
    }
}
