package MultidimensionalArray;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[6][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        arr[3]=new int[3];
        arr[4]=new int[4];
        arr[5]=new int[6];
        int count=10;
        int len = arr.length;
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
