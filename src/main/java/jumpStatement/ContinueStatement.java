package jumpStatement;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i <=2 ; i++) {
            for (int j = i; j <=5 ; j++) {
                if(j==3){
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
