package MultidimensionalArray;

public class MArray2 {
    public static void main(String[] args) {
        int arr[][] = {{10,12,14},{16,18,20},{22,24,26},{28,30,32}};
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            int len1=arr[i].length;
            for (int j = 0; j < len1; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
