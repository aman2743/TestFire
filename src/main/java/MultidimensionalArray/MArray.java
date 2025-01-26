package MultidimensionalArray;

public class MArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int count=10;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j]=count;
                System.out.print(arr[i][j]);
                System.out.print(" ");
                count=count+2;
            }
            System.out.println();
        }
    }
}
