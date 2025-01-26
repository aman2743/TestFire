package MultidimensionalArray;

public class Array3D {
    public static void main(String[] args) {
        int arr[][][] = { { {1,2,3} , {1,4,5} , {2,5,6}} ,{{1,2,3},{1,4,5},{2,5,6}},{{1,2,3},{1,4,5},{2,5,6}}};
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    System.out.print(arr[i][j][k]);
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
